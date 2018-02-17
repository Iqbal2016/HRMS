package com.iqbal.hrms.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iqbal.hrms.Model.AssetReliseProcess;
import com.iqbal.hrms.Model.AttachedFile;
import com.iqbal.hrms.Model.CaseBasicInfo;
import com.iqbal.hrms.Model.CaseRemark;
import com.iqbal.hrms.Model.CourtOrder;
import com.iqbal.hrms.Model.DefulderInformation;
import com.iqbal.hrms.Model.InvestigationOrganizationInfo;
import com.iqbal.hrms.Model.InvestigationResult;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.Model.RequesterInfo;
import com.iqbal.hrms.Model.SeizedAssetDetails;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.interfaces.CaseInformationView;
import com.iqbal.hrms.interfaces.CaseRegistration;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CaseRegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(CaseRegistrationController.class);
 
	@Autowired
	private CaseRegistration caseRegistration;

	@Autowired
	private CaseInformationView informationView;

	@ModelAttribute("caseBasicInfo")
	private CaseBasicInfo constructCaseBasicInfo() {
		return new CaseBasicInfo();
	}

	@ModelAttribute("defulderInformation")
	private DefulderInformation constructDefulderInformation() {

		return new DefulderInformation();
	}

	@ModelAttribute("investigationOrganizationInfo")
	private InvestigationOrganizationInfo constructInvestigationOrganizationInfo() {

		return new InvestigationOrganizationInfo();
	}

	@ModelAttribute("investigationResult")
	private InvestigationResult constructInvestigationResult() {

		return new InvestigationResult();
	}
	@ModelAttribute("requesterInfo")
	private RequesterInfo constructRequesterInfo() {

		return new RequesterInfo();
	}

	@ModelAttribute("seizedAssetDetails")
	private SeizedAssetDetails constructSeizedAssetDetails() {

		return new SeizedAssetDetails();
	}


	@ModelAttribute("courtOrder")
	private CourtOrder constructCourtOrder() {

		return new CourtOrder();
	}

	@ModelAttribute("caseRemark")
	private CaseRemark constructCaseRemark() {

		return new CaseRemark();
	}

	@ModelAttribute("attachedFile")
	private AttachedFile constractAttachedFile() {

		return new AttachedFile();
	}

	@ModelAttribute("assetReliseProcess")
	private AssetReliseProcess constractAssetReliseProcess() {

		return new AssetReliseProcess();
	}

	@RequestMapping(value = "/registerNewCase", method = RequestMethod.GET)
	public String showInitialInfoForm(Model model) throws ServiceException {
		logger.info("Rendering page for initial case info! ");

		ArrayList<String> battalionNames = caseRegistration.getBattalionNames();
		ArrayList<String> lawNames = caseRegistration.getLawName();
		//ArrayList<String> companyNames = caseRegistration.getCompanyNames();
		//ArrayList<String> policeStations = caseRegistration.getPoliceStation();		 
		ArrayList<String> districts = caseRegistration.getDistricts();
		ArrayList<String> typeOfCrimes = caseRegistration.getTypeOfCrime();
		model.addAttribute("typeOfCrimes", typeOfCrimes);
		model.addAttribute("lawNames", lawNames);
		//model.addAttribute("policeStations", policeStations);
		model.addAttribute("battalionNames", battalionNames);
		//model.addAttribute("companyNames", companyNames);		 
		model.addAttribute("district", districts);

		return "home";
	}

	@RequestMapping(value = "/showdetailsinputform", method = RequestMethod.POST)
	public String createCase(@Valid @ModelAttribute("caseBasicInfo") CaseBasicInfo caseBasicInfo, BindingResult result,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New case request received  : " + caseBasicInfo);
		
		

		if (result.hasErrors()) {
			return "redirect:/registerNewCase";
		}
		
		String orgName = caseBasicInfo.getFile().getOriginalFilename(); 

		String filePath = "C:\\report\\"  + "-" + orgName;
		File dest = new File(filePath);
		try {
			caseBasicInfo.getFile().transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		}
		
		caseBasicInfo.setFilePath(filePath); 

		int currentId = caseRegistration.addNewCase(caseBasicInfo);

		session.setAttribute("currentId", currentId);

		session.setAttribute("caseBasicInfo", caseBasicInfo);

		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);
		
		 

		return "redirect:addDetailspage#tab_1";
	}

	@RequestMapping(value = "/defultderInfo", method = RequestMethod.POST)
	public String addDefultderInfo(@ModelAttribute("defulderInformation") DefulderInformation defulderInformation,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New defultder Info received  : " + defulderInformation);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}
		
		

		caseRegistration.addDefulderInformation(defulderInformation, currentId);
		
		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		return "redirect:addDetailspage#tab_2";
	}

	@RequestMapping(value = "/addInvestigationOrgInfo", method = RequestMethod.POST)
	public String addInvestigationOrgInfo(
			@ModelAttribute("investigationOrganizationInfo") InvestigationOrganizationInfo invOrganizationInfo,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New case request received  : " + invOrganizationInfo);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}
		
		caseRegistration.addInvestigationInfo(invOrganizationInfo, currentId);

		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		
		return "redirect:addDetailspage#tab_3";
	}

	@RequestMapping(value = "/addInvestigationResult", method = RequestMethod.POST)
	public String addInvestigationResult(@ModelAttribute("investigationResult") InvestigationResult result,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New add Investigation Result request received  : " + result);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}

		String orgName = result.getFile().getOriginalFilename(); 

		String filePath = "C:\\report\\" + currentId + "-" + orgName;
		File dest = new File(filePath);
		try {
			result.getFile().transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		}
		
		result.setFilePath(filePath); 

		caseRegistration.addInvestigationResult(result, currentId);
		
		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		return "redirect:addDetailspage#tab_4";
	}

	@RequestMapping(value = "/AddSeizedAssetDetails", method = RequestMethod.POST)
	public String AddSeizedAssetDetails(@ModelAttribute("seizedAssetDetails") SeizedAssetDetails seizedAssetDetails,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New add AddSeizedAssetDetails  request received  : " + seizedAssetDetails);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}
		 
		String orgName = seizedAssetDetails.getFile().getOriginalFilename();

		String filePath = "C:\\report\\" + currentId + "-" + orgName;
		File dest = new File(filePath);
		try {
			seizedAssetDetails.getFile().transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		}
		
		seizedAssetDetails.setFilePath(filePath); 
		
		caseRegistration.addSeizedAssetDetails(seizedAssetDetails, currentId);

		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		

		return "redirect:addDetailspage#tab_6";
	}

	@RequestMapping(value = "/AddRequester", method = RequestMethod.POST)
	public String AddRequester(@ModelAttribute("requesterInfo") RequesterInfo requesterInfo, RedirectAttributes model,
			HttpSession session) throws ServiceException {

		logger.info("New add AddSeizedAssetDetails  request received  : " + requesterInfo);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}

		

		caseRegistration.addRequester(requesterInfo, currentId);

		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);
		
		return "redirect:/addDetailspage#tab_0";
	}

	@RequestMapping(value = "/AddCourtOrder", method = RequestMethod.POST)
	public String AddCourtOrder(@ModelAttribute("courtOrder") CourtOrder courtOrder, RedirectAttributes model,
			HttpSession session) throws ServiceException {

		logger.info("New add AddSeizedAssetDetails  request received  : " + courtOrder);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}

		
		
		String orgName = courtOrder.getFile().getOriginalFilename();

		String filePath = "C:\\report\\" + currentId + "-" + orgName;
		File dest = new File(filePath);
		try {
			courtOrder.getFile().transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("File uploaded failed:" + orgName);
		}
		
		courtOrder.setFilePath(filePath); 

		caseRegistration.addCourtOrder(courtOrder, currentId);
		
		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		return "redirect:addDetailspage#CourtOrder";
	}

	@RequestMapping(value = "/AddRemark", method = RequestMethod.POST)
	public String AddCaseRemark(@ModelAttribute("caseRemark") CaseRemark caseRemark, RedirectAttributes model,
			HttpSession session) throws ServiceException {

		logger.info("New add AddRemark  request received  : " + caseRemark);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}
		
		caseRegistration.addCaserRemark(caseRemark, currentId);
		
		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		

		return "redirect:addDetailspage#Remark";
	}

	@RequestMapping(value = "/AddFile", method = RequestMethod.POST)
	public String AddFile(@RequestParam("file") MultipartFile[] files, @RequestParam("fileName") String fileName, RedirectAttributes model, HttpSession session)
			throws ServiceException {

		int currentId = (Integer) session.getAttribute("currentId");
		for (MultipartFile file : files) {

			AttachedFile attachedFile = new AttachedFile();

			MultipartFile multipartFile = file;
			String orgName = multipartFile.getOriginalFilename();

			String filePath = "C:\\report\\" + currentId + "-" + orgName;
			File dest = new File(filePath);
			try {
				multipartFile.transferTo(dest);
			} catch (IllegalStateException e) {
				e.printStackTrace();
				logger.info("File uploaded failed:" + orgName);
			} catch (IOException e) {
				e.printStackTrace();
				logger.info("File uploaded failed:" + orgName);
			}

			if (currentId < 0) {
				session.removeAttribute("currentId");

				return "home";
			}
			model = addDropdownData(model, currentId);

			model = getDetailsData(model, currentId);

			logger.info("New add File  request received  : " + attachedFile);

			attachedFile.setFileName(fileName);

			attachedFile.setFileType(file.getContentType());

			attachedFile.setFilePath(filePath);

			caseRegistration.addAttachment(attachedFile, currentId);
		}

		return "redirect:addDetailspage#fileUpload";
	}

	@RequestMapping(value = "/addAssetReliseProcess", method = RequestMethod.POST)
	public String addAssetReliseProcess(@ModelAttribute("assetReliseProcess") AssetReliseProcess assetReliseProcess,
			RedirectAttributes model, HttpSession session) throws ServiceException {

		logger.info("New add AddRemark  request received  : " + assetReliseProcess);

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}
		model = addDropdownData(model, currentId);

		model = getDetailsData(model, currentId);

		caseRegistration.addAssetReliseProcess(assetReliseProcess, currentId);

		return "redirect:addDetailspage";
	}

	@RequestMapping(value = "/addDetailspage")
	public String addDetailspage(HttpSession session, RedirectAttributes attributes) throws ServiceException {

		int currentId = (Integer) session.getAttribute("currentId");

		if (currentId < 0) {
			session.removeAttribute("currentId");

			return "home";
		}

		return "detailsInput"; 
	}
	
	
	@RequestMapping(value = "/getCompanyList",method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public  @ResponseBody String getCompanyList(ReportRequestVO reportRequestVO) throws ServiceException{
		
		
		logger.info("Entering"+reportRequestVO.getBattalionName()); 
		
		 String comNames=informationView.getCompanyByBattalion(reportRequestVO.getBattalionName());
		
		System.out.println(comNames );
		return comNames ;
	}
	
	
	
	@RequestMapping(value = "/getThanaList",method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public  @ResponseBody String getThanaList(ReportRequestVO reportRequestVO) throws ServiceException{
		
		
		logger.info("Entering for thana"+reportRequestVO.getDistName()); 
		 String thanaNames=informationView.getThanaByDist(reportRequestVO.getDistName());
		
		 logger.info("Thana Names:"+thanaNames); 
		return thanaNames ;
	}
	
	

	private RedirectAttributes getDetailsData(RedirectAttributes model, int currentId) throws ServiceException {

		CaseBasicInfo caseBasicInfo = informationView.getCaseInfo(currentId);
		ArrayList<RequesterInfo> requesterInfos = informationView.getRequester(currentId);
		// logger.info("Requester info...." +requesterInfos);
		ArrayList<DefulderInformation> defaulderInfos = informationView.getDefulderInformation(currentId);
	 logger.info("returning defaulder info ********"+ defaulderInfos);
		ArrayList<SeizedAssetDetails> seizedList = informationView.getSeizedAssetDetails(currentId);
		// logger.info("asset details list : "+seizedList );
		ArrayList<InvestigationOrganizationInfo> orgList = informationView.getInvestigationInfo(currentId);
		// logger.info("organization list : "+orgList );
		ArrayList<InvestigationResult> invResultList = informationView.getInvestigationResult(currentId);
		CourtOrder courtOrder = informationView.getCourtOrder(currentId);
		// logger.info("court order: "+courtOrder);

		CaseRemark remark = informationView.getCaserRemark(currentId);
		AssetReliseProcess assetReliseProcess = informationView.getAssetReliseProcess(currentId);

		model.addFlashAttribute("assetReliseProcess", assetReliseProcess);
		model.addFlashAttribute("remark", remark);
		model.addFlashAttribute("courtOrder", courtOrder);
		model.addFlashAttribute("invResultList", invResultList);
		model.addFlashAttribute("orgList", orgList);
		model.addFlashAttribute("seizedList", seizedList);
		model.addFlashAttribute("defaulderInfos", defaulderInfos);
		model.addFlashAttribute("requesterInfos", requesterInfos);
		model.addFlashAttribute("caseBasicInfo", caseBasicInfo);

		return model;
	}

	private RedirectAttributes addDropdownData(RedirectAttributes model, int currentId) throws ServiceException {

		ArrayList<String> battalionNames = caseRegistration.getBattalionNames();
		ArrayList<String> lawNames = caseRegistration.getLawName();
		ArrayList<String> companyNames = caseRegistration.getCompanyNames();
		ArrayList<String> policeStations = caseRegistration.getPoliceStation();
		ArrayList<String> orgNames = caseRegistration.getOrganizations();
		ArrayList<String> districts = caseRegistration.getDistricts();

		model.addFlashAttribute("lawNames", lawNames);
		model.addFlashAttribute("policeStations", policeStations);
		model.addFlashAttribute("battalionNames", battalionNames);
	    model.addFlashAttribute("companyNames", companyNames);
		model.addFlashAttribute("orgName", orgNames);
		model.addFlashAttribute("district", districts);

		return model;

	}

}
