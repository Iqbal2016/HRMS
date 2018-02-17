
package com.iqbal.hrms.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqbal.hrms.util.Constants;
import com.iqbal.hrms.Model.AssetReliseProcess;
import com.iqbal.hrms.Model.CaseBasicInfo;
import com.iqbal.hrms.Model.CaseRemark;
import com.iqbal.hrms.Model.CourtOrder;
import com.iqbal.hrms.Model.DefulderInformation;
import com.iqbal.hrms.Model.InvestigationOrganizationInfo;
import com.iqbal.hrms.Model.InvestigationResult;
import com.iqbal.hrms.Model.RequesterInfo;
import com.iqbal.hrms.Model.SeizedAssetDetails;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.CaseInformationView;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;

public class CaseInformationViewImpl implements CaseInformationView {
	private static final Logger logger = LoggerFactory.getLogger(CaseInformationViewImpl.class);

	private StoredProcJdbcDao storedProcJdbcDao;

	 

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public CaseBasicInfo getCaseInfo(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		CaseBasicInfo caseBasicInfo = new CaseBasicInfo();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GET_Case_Info, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					caseBasicInfo.setPoliceStationName(resultSet.getString("policestationname"));
					caseBasicInfo.setSerialNumber(resultSet.getString("serailno"));
					caseBasicInfo.setCaseNumber(resultSet.getString("caseno"));
					caseBasicInfo.setCaseDate(resultSet.getString("casedate"));
					caseBasicInfo.setLawName(resultSet.getString("case_law_name"));
					caseBasicInfo.setCaseDahara(resultSet.getString("case_dhara"));
					caseBasicInfo.setBattalionName(getBattalionName(resultSet.getInt("bat_id")));
					caseBasicInfo.setCompanyName(getBattalionName(resultSet.getInt("comp_id")));
					caseBasicInfo.setTypeOfCrime(resultSet.getString("type_of_crime"));
					caseBasicInfo.setPlaceOfCrime(resultSet.getString("place_of_crime"));
					caseBasicInfo.setTimeOfCrime(resultSet.getString("time_of_crime"));
					caseBasicInfo.setCrimeDescription(resultSet.getString("crime_description"));
                    //date_of_crime,filePath,district 
					caseBasicInfo.setDistrict(resultSet.getString("district"));
					caseBasicInfo.setDateOfCrime(resultSet.getString("date_of_crime"));

					logger.info("returning value : " + caseBasicInfo);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + caseBasicInfo);

		return caseBasicInfo;

	}

	@Override
	public String getCompanyName(int companyId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(companyId));
		String companyName = new String();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Comp_Name_By_Id, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					companyName = resultSet.getString("comp_name");
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return companyName;

	}

	@Override
	public String getBattalionName(int battlionId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(battlionId));
		String companyName = new String();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Bat_Name_By_Id, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					companyName = resultSet.getString("bat_name");
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return companyName;

	}

	@Override
	public ArrayList<RequesterInfo> getRequester(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		ArrayList<RequesterInfo> requesterInfos = new ArrayList<RequesterInfo>();
		;
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Requester_Info, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					RequesterInfo info = new RequesterInfo();
					info.setRequestorName(resultSet.getString("case_requestorname"));
					info.setRequesterId(resultSet.getString("case_requestorId"));
					info.setRequesterMobileNo(resultSet.getString("case_requestormobileno"));
					info.setId(resultSet.getInt("Id"));
					info.setRequesterAddress(resultSet.getString("case_requestoraddress"));
					requesterInfos.add(info);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + requesterInfos);

		return requesterInfos;

	}

	@Override
	public ArrayList<DefulderInformation> getDefulderInformation(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		ArrayList<DefulderInformation> requesterInfos = new ArrayList<DefulderInformation>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Defulder_Info, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					DefulderInformation info = new DefulderInformation();
					info.setDefulderNumber(resultSet.getString("case_defultderNumber"));
					info.setDefulderName(resultSet.getString("case_nameofdefultder"));
					info.setDistrict(resultSet.getString("case_defaulderdist"));
					info.setId(resultSet.getInt("Id"));
					info.setFatherName(resultSet.getString("Father_Name"));

					info.setSubDistrict(resultSet.getString("sub_district"));
					info.setMotherName(resultSet.getString("MotherName"));
					info.setGender(resultSet.getString("gender"));

					info.setHusbandName(resultSet.getString("HusbandName"));
					info.setDefulderAddress(resultSet.getString("case_defulderaddress"));
					info.setAge(resultSet.getInt("age"));
					info.setNationalId(resultSet.getString("NationalID"));

					requesterInfos.add(info);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + requesterInfos);

		return requesterInfos;

	}

	@Override
	public ArrayList<SeizedAssetDetails> getSeizedAssetDetails(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		ArrayList<SeizedAssetDetails> SeizedAssetDetailsList = new ArrayList<SeizedAssetDetails>();
		;
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetSeizedAssetInfo, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					SeizedAssetDetails info = new SeizedAssetDetails();
					info.setDetails(resultSet.getString("ws_wealth_details"));
					info.setCost(resultSet.getString("ws_wealth_appr_cost"));
					info.setPlace(resultSet.getString("ws_wealth_crk_place"));
					info.setDate(resultSet.getString("ws_wealth_crk_date"));
					info.setPrNumber(resultSet.getString("ws_pr_no"));
					info.setMrNumbber(resultSet.getString("ws_mr_no"));
					info.setOfficerName(resultSet.getString("seized_officer_name"));
					info.setOfficerPost(resultSet.getString("seized_officer_Title"));
					info.setId(resultSet.getInt("Id"));
					info.setAssetReliseProcess(resultSet.getString("asset_relise_process"));
					info.setAssetReliseDate(resultSet.getString("ws_wealth_relise_date"));
					info.setReliseTime(resultSet.getString("ws_wealth_relise_time"));
					info.setFilePath(resultSet.getString("attachmentfilePath"));
					info.setTime(resultSet.getString("ws_wealth_crk_time"));
					SeizedAssetDetailsList.add(info);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + SeizedAssetDetailsList);

		return SeizedAssetDetailsList;

	}

	@Override
	public ArrayList<InvestigationOrganizationInfo> getInvestigationInfo(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		ArrayList<InvestigationOrganizationInfo> invOfficeInfoList = new ArrayList<InvestigationOrganizationInfo>();
		;
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetInvestigationOfficeInfo, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					InvestigationOrganizationInfo info = new InvestigationOrganizationInfo();
					info.setOfficeName(resultSet.getString("case_investiagationofficename"));
					info.setOfficerName(resultSet.getString("case_investiagationofficername"));
					info.setOfficerTitle(resultSet.getString("case_investiagationofficertitle"));
					info.setOfficerMobileNO(resultSet.getString("case_investiagationofficercontactno"));
					info.setId(resultSet.getInt("Id"));

					invOfficeInfoList.add(info);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + invOfficeInfoList);

		return invOfficeInfoList;
	}

	@Override
	public ArrayList<InvestigationResult> getInvestigationResult(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		ArrayList<InvestigationResult> invRessltList = new ArrayList<InvestigationResult>();
		;
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetInvestigationresult, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					
					InvestigationResult info = new InvestigationResult();
					info.setCsNumber(resultSet.getString("case_invst_resultcs_csno"));
					info.setFrNumber(resultSet.getString("case_invst_resultcs_frno"));
					info.setFrType(resultSet.getString("fr_type"));
					info.setFrDate(resultSet.getString("fr_date"));
					info.setCaseDhara(resultSet.getString("case_invst_result_dhara"));
					info.setResultDate(resultSet.getString("case_invst_result_date"));
					info.setDefulderName(resultSet.getString("case_invst_result_cs_defaulderName"));

					info.setDefulderNumber(resultSet.getString("case_invst_result_cs_defaulderNumber"));
					info.setDefulderAddress(resultSet.getString("case_invst_result_cs_defaulderaddress"));
					info.setId(resultSet.getInt("Id"));
					invRessltList.add(info);
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + invRessltList);

		return invRessltList;
	}

	@Override
	public CourtOrder getCourtOrder(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		CourtOrder info = new CourtOrder();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetCourtResult, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {

					info.setCourtOrder(resultSet.getString("case_result_courtorder"));
					info.setDate(resultSet.getString("case_result_courtorder_date"));
					info.setFmNumber(resultSet.getString("case_result_courtorderfmno"));
					info.setId(resultSet.getInt("Id"));

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + info);

		return info;

	}

	@Override
	public CaseRemark getCaserRemark(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		CaseRemark info = new CaseRemark();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetRemark, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {

					info.setRemark(resultSet.getString("case_remark"));

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + info);

		return info;

	}

	@Override
	public AssetReliseProcess getAssetReliseProcess(int currentId) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(Integer.toString(currentId));
		AssetReliseProcess info = new AssetReliseProcess();
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetAssetReliseProcess, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {

					info.setAssetReliseProcess(resultSet.getString("ws_wealth_relive_process"));
					info.setAssetReliseDate(resultSet.getString("ws_wealth_relive_date"));

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + info);

		return info;

	}

	@Override
	public  String  getCompanyByBattalion(String battalionName) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(battalionName);
		ArrayList<String> infos = new ArrayList<String>();
		String finalString=new String();
		
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.getCompanyListBYBattalion, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					
				 	finalString=finalString+resultSet.getString("comp_name")+"$";
					//infos.add(resultSet.getString("comp_name"));
				 	 
				//	finalString="one,two";

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + finalString);

		return finalString;

	}

	
	@Override
	public  String  getThanaByDist(String distName) throws ServiceException {
		
		logger.info("DistName in Implservice Class : " +distName);
		
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(distName);
		ArrayList<String> infos = new ArrayList<String>();
		String finalString=new String();
		
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.getThanaListBYDist, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					
					logger.info("data String : " +resultSet.getString("PoliceStationName"));
				 	finalString=finalString+resultSet.getString("PoliceStationName")+"$";
					//infos.add(resultSet.getString("comp_name"));
				 	 
				//	finalString="one,two";

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		logger.info("returning data : " + finalString);

		return finalString;

	}

}
