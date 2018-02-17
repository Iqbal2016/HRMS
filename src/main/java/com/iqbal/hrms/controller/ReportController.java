package com.iqbal.hrms.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iqbal.hrms.Model.ActivityReportVO;
import com.iqbal.hrms.Model.AssetReliseProcess;
import com.iqbal.hrms.Model.CaseBasicInfo;
import com.iqbal.hrms.Model.CaseRemark;
import com.iqbal.hrms.Model.CourtOrder;
import com.iqbal.hrms.Model.DefulderInformation;
import com.iqbal.hrms.Model.InvestigationOrganizationInfo;
import com.iqbal.hrms.Model.InvestigationResult;
import com.iqbal.hrms.Model.ReportData;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.Model.RequesterInfo;
import com.iqbal.hrms.Model.SeizedAssetDetails;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.interfaces.CaseInformationView;
import com.iqbal.hrms.interfaces.CaseRegistration;
import com.iqbal.hrms.interfaces.Report;
import com.iqbal.hrms.interfaces.SearchResult;

@Controller
public class ReportController {

	private static final Logger logger = LoggerFactory.getLogger(ReportController.class);

	@Autowired
	private Report report;

	@Autowired
	private SearchResult searchResult;

	@Autowired
	private CaseRegistration caseRegistration;
	
	@Autowired
	private CaseInformationView informationView;

	@ModelAttribute("requestVO")
	private ReportRequestVO constractReportVO() {

		return new ReportRequestVO();
	}

	@RequestMapping(value = "/searchByBatAndCompany", method = RequestMethod.GET)
	public String home(Model model) throws ServiceException {

		logger.info("Showing  Battalion report ");
		ArrayList<String> battalionNames = caseRegistration.getBattalionNames();
		model.addAttribute("battalionNames", battalionNames); 

		model.addAttribute("allBattalionSummary",report.getCrimeReportByBattalion());
		model.addAttribute("allLawNameSummary",report.getCrimeReportByLawName());
		model.addAttribute("allCrimeTypeSummary",report.getCrimeReportByCrimeType());

		return "report";
	}

	@RequestMapping(value = "/searchByBatAndCompany", method = RequestMethod.POST)
	public String searchByBattalionAndComp(@ModelAttribute("requestVO") ReportRequestVO requestVO, Model model,
			HttpSession session) throws ServiceException, UnsupportedEncodingException {

		logger.info("Showing  Date report fro parameter :  " + requestVO);
		ArrayList<String> battalionNames = caseRegistration.getBattalionNames();
		model.addAttribute("battalionNames", battalionNames);
		model.addAttribute("reports", searchResult.searchByBattalionAndCompany(requestVO));
		model.addAttribute("allBattalionSummary",report.ReportSummaryByBattalion(requestVO));
		model.addAttribute("allLawNameSummary",report.ReportSummaryByLawName(requestVO));
		model.addAttribute("allCrimeTypeSummary",report.ReportSummaryByTypeOfCrime(requestVO));

		return "report";
	}

	@RequestMapping(value = "/reportByCrime", method = RequestMethod.GET)
	public String reportByCrime(Model model) throws ServiceException {

		logger.info("Showing  thana report ");
		
		ArrayList<String> lawNames = caseRegistration.getLawName();
		model.addAttribute("lawNames", lawNames); 

		return "reportByCrime";
	}
	
	@RequestMapping(value = "/reportByLaw", method = RequestMethod.GET)
	public String reportByLaw(Model model) throws ServiceException {

		logger.info("Showing  thana report ");
		
		ArrayList<String> lawNames = caseRegistration.getLawName();
		model.addAttribute("lawNames", lawNames); 

		return "reportByLaw";
	}
	
	
	
	
	@RequestMapping(value = "/reportByCrime", method = RequestMethod.POST)
	public String searchReportByCrime(@ModelAttribute("requestVO") ReportRequestVO requestVO,Model model) throws ServiceException {
             
		 logger.info("data : "+searchResult.searchByCrime(requestVO));
		model.addAttribute("reports", searchResult.searchByCrime(requestVO));
		
		ArrayList<String> lawNames = caseRegistration.getLawName();
		model.addAttribute("lawNames", lawNames); 

		return "reportByCrime";
	}

	@RequestMapping(value = "/reportByCompany", method = RequestMethod.GET)
	public String getDetails(@RequestParam("caseid") int caseId, Model model) throws ServiceException {

		logger.info("Showing  detalis report for caseId"+caseId);
		
	   model=getDetailsPageData(model,caseId);

		return "CaseDelails";
	}

	@RequestMapping(value = "/reportByDate", method = RequestMethod.GET)
	public String reportByDate(Model model) {

		logger.info("Showing  Date report page");

		return "reportByDate";
	}
	
	@RequestMapping(value = "/allCase", method = RequestMethod.GET)
	public String viewAllCase(Model model) throws ServiceException {

		logger.info("Showing  all case");
		
		model.addAttribute("reports", searchResult.getAllCase() ); 

		return "allCase";
	}

	@RequestMapping(value = "/reportByDatepdf", method = RequestMethod.POST)
	public String reportByDatePDF(@ModelAttribute("requestVO") ReportRequestVO requestVO, Model model,
			HttpSession session) throws ServiceException, UnsupportedEncodingException {

		logger.info("Showing  Date report fro parameter :  " + requestVO);

		model.addAttribute("reports", searchResult.searchByDate(requestVO));
		

		model.addAttribute("allBattalionSummary",report.dateReportByBattalionAll(requestVO));
		model.addAttribute("allLawNameSummary",report.dateReportByLawNameAll(requestVO));
		model.addAttribute("allCrimeTypeSummary",report.dateReportByCrimeType(requestVO));

		return "reportByDate";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showDashboard(Model model, HttpSession session) throws ServiceException {

		logger.info("Showing dashboard");

		List<ReportData> reportData = report.getDashBoardData();

		List<ActivityReportVO> activityReportVOs = report.getActivityReport();

		logger.info("returning data :" + activityReportVOs);

		model.addAttribute("activityReport", activityReportVOs);

		model.addAttribute("reportData", reportData);
		
		model.addAttribute("allBattalionSummary",report.getCrimeReportByBattalion());
		model.addAttribute("allLawNameSummary",report.getCrimeReportByLawName());
		model.addAttribute("allCrimeTypeSummary",report.getCrimeReportByCrimeType());
		return "dashboard";
	}
	
	private Model getDetailsPageData(Model model,int currentId) throws ServiceException {
 
		CaseBasicInfo caseBasicInfo=informationView.getCaseInfo(currentId);
		ArrayList<RequesterInfo> requesterInfos=informationView.getRequester(currentId);
		//logger.info("Requester info...." +requesterInfos); 
		ArrayList<DefulderInformation> defaulderInfos=informationView.getDefulderInformation(currentId);
		//logger.info("returning defaulder info  "+ defaulderInfos);
		ArrayList<SeizedAssetDetails> seizedList=informationView.getSeizedAssetDetails(currentId);		
		//logger.info("asset details list : "+seizedList ); 
		ArrayList<InvestigationOrganizationInfo> orgList=informationView.getInvestigationInfo(currentId);
		//logger.info("organization list : "+orgList ); 
		ArrayList<InvestigationResult> invResultList=informationView.getInvestigationResult(currentId);
		CourtOrder courtOrder=informationView.getCourtOrder(currentId);
		//logger.info("court order: "+courtOrder);
		
		CaseRemark remark=informationView.getCaserRemark(currentId);
		AssetReliseProcess assetReliseProcess=informationView.getAssetReliseProcess(currentId);           
		model.addAttribute("assetReliseProcess", assetReliseProcess); 
		model.addAttribute("remark", remark);
		model.addAttribute("courtOrder", courtOrder);
		model.addAttribute("invResultList",invResultList);
		model.addAttribute("orgList",orgList);
		model.addAttribute("seizedList",seizedList);
        model.addAttribute("defaulderInfos",defaulderInfos);
        model.addAttribute("requesterInfos", requesterInfos);
		model.addAttribute("caseBasicInfo", caseBasicInfo); 
		return model;

	}

	
}
