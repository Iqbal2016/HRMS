package com.iqbal.hrms.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqbal.hrms.util.Constants;
import com.iqbal.hrms.Model.AssetReliseProcess;
import com.iqbal.hrms.Model.AttachedFile;
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
import com.iqbal.hrms.interfaces.CaseRegistration;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;

public class CaseRegistrationImp implements CaseRegistration {

	private static final Logger logger = LoggerFactory.getLogger(CaseRegistrationImp.class);

	private StoredProcJdbcDao storedProcJdbcDao;

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public int addNewCase(CaseBasicInfo caseBasicInfo) throws ServiceException {

		ResultSet resultSet = null;
		int currentId = 0;
		List<String> values = new ArrayList<String>();
		values.add(caseBasicInfo.getSerialNumber());
		values.add(caseBasicInfo.getPoliceStationName());
		values.add(caseBasicInfo.getCaseNumber());
		values.add(caseBasicInfo.getCaseDate().toString());
		values.add(caseBasicInfo.getLawName());
		values.add(caseBasicInfo.getCaseDahara());
		values.add(caseBasicInfo.getBattalionName());
		values.add(caseBasicInfo.getCompanyName());
		values.add(caseBasicInfo.getTypeOfCrime());
		values.add(caseBasicInfo.getPlaceOfCrime());
		values.add(caseBasicInfo.getTimeOfCrime());
		values.add(caseBasicInfo.getCrimeDescription()); 
		values.add(caseBasicInfo.getDateOfCrime()); 
		values.add(caseBasicInfo.getFilePath());
		values.add(caseBasicInfo.getDistrict()); 

 // ResultSet resultSet = null;
		try {
			if (caseBasicInfo.getCaseDahara() == null || caseBasicInfo.getCaseDahara().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Creatin new case : " + caseBasicInfo);

				resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ADD_NEW_CASE , values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {

			try {
				while (resultSet.next()) {

					currentId = resultSet.getInt("currentId");
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return currentId;
	}

	@Override
	public void addDefulderInformation(DefulderInformation defulderInformation,int currentId) throws ServiceException {
	 
		List<String> values = new ArrayList<String>();
		values.add(defulderInformation.getDefulderNumber());
		values.add(defulderInformation.getDefulderName()); 
		values.add(defulderInformation.getDistrict());
		values.add(defulderInformation.getFatherName());
		values.add(defulderInformation.getSubDistrict());
		values.add(defulderInformation.getNationalId());    
		values.add(defulderInformation.getMotherName());
		values.add(defulderInformation.getHusbandName());
		values.add(defulderInformation.getDefulderAddress());
		values.add(Integer.toString(defulderInformation.getAge()) );
		values.add(defulderInformation.getGender());
		values.add(Integer.toString(currentId)); 
		
		
 
		try {
			if (defulderInformation.getDefulderName() == null || defulderInformation.getDefulderName().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Creatin new case : " + defulderInformation);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Defulder, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		 
		
	}

	@Override
	public void addInvestigationInfo(InvestigationOrganizationInfo organizationInfo, int currentId)
			throws ServiceException {

		List<String> values = new ArrayList<String>();
		values.add(organizationInfo.getOfficeName());
		values.add(organizationInfo.getOfficerName());
		values.add(organizationInfo.getOfficerTitle());
		values.add(organizationInfo.getOfficerMobileNO());
		values.add(Integer.toString(currentId));  
		try {
			if (organizationInfo.getOfficeName() == null || organizationInfo.getOfficeName().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding  Investigation Info new case : " + organizationInfo);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Investiagation_Info, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		 

		
	}

	@Override
	public void addInvestigationResult(InvestigationResult result, int currentId) throws ServiceException {
		List<String> values = new ArrayList<String>();
		values.add(result.getCsNumber());
		values.add(result.getFrNumber());
		values.add(result.getFrType() );
		values.add(result.getFrDate() );
		values.add(result.getCaseDhara());
		
		values.add(result.getResultDate());
		values.add(result.getDefulderName());
		values.add(result.getDefulderNumber());		
		values.add(result.getDefulderAddress());
		values.add(result.getFilePath());
		values.add(Integer.toString(currentId));  
		try {
			if (result.getCsNumber() == null || result.getCsNumber().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding  Investigation Info new case : " + result);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Investigation_Result, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}		
	}

	@Override
	public void addSeizedAssetDetails(SeizedAssetDetails assetDetails, int currentId) throws ServiceException {
		 
		
		List<String> values = new ArrayList<String>();
		values.add(assetDetails.getReliseTime());
		values.add(assetDetails.getFilePath());
		values.add(assetDetails.getTime());
		values.add(assetDetails.getDetails());
		values.add(assetDetails.getCost()); 
		values.add(assetDetails.getPlace()); 
		values.add(assetDetails.getDate()); 
		values.add(assetDetails.getPrNumber()); 
		values.add(assetDetails.getMrNumbber()); 
		values.add(assetDetails.getOfficerName());
		values.add(assetDetails.getOfficerPost());
		values.add(Integer.toString(currentId));  
		values.add(assetDetails.getAssetReliseProcess());
		values.add(assetDetails.getAssetReliseDate());
	
		try {
			if (assetDetails.getDetails() == null || assetDetails.getDetails().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding  Seized Asset Details Info new case : " + assetDetails);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Seized_Asset_Details, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}	
		
	}

	@Override
	public void addRequester(RequesterInfo requesterInfo, int currentId) throws ServiceException {
		 
		
		List<String> values = new ArrayList<String>();
		values.add(requesterInfo.getRequestorName());
		values.add(requesterInfo.getRequesterId());
		values.add(requesterInfo.getRequesterMobileNo()); 
		values.add(Integer.toString(currentId)); 
		values.add(requesterInfo.getRequesterAddress());
		 
		  
		
		try {
			if (requesterInfo.getRequestorName() == null || requesterInfo.getRequestorName().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding   Requester Info new case : " + requesterInfo);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Requester, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}	
		 
	}

	@Override
	public void addCourtOrder(CourtOrder courtOrder, int currentId) throws ServiceException {
		List<String> values = new ArrayList<String>();
		values.add(courtOrder.getCourtOrder());
		values.add(courtOrder.getFmNumber());
		values.add(courtOrder.getDate());
		values.add(Integer.toString(currentId));  
		try {
			if (courtOrder.getCourtOrder() == null || courtOrder.getCourtOrder().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding   Requester Info new case : " + courtOrder);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Court_Order, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public void addCaserRemark(CaseRemark  remark, int currentId) throws ServiceException {
		List<String> values = new ArrayList<String>();
		values.add(remark.getRemark());
		 
		values.add(Integer.toString(currentId));  
		try {
			if (remark.getRemark() == null || remark.getRemark().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding   Remark Info new case : " + remark);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Remark, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}

	@Override
	public ArrayList<String> getCompanyNames() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> companyNames=new ArrayList<String>();
		companyNames.add("SELECT A VALUE");
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Company_Name, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				  companyNames.add(resultSet.getString("comp_name"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return companyNames;
		
	}

	@Override
	public ArrayList<String> getBattalionNames() throws ServiceException {
		 
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> battalionNames=new ArrayList<String>();
		battalionNames.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Battalion_Name, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				  battalionNames.add(resultSet.getString("bat_name"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return battalionNames;
		 
	}

	@Override
	public ArrayList<String> getOrganizations() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> orgNames=new ArrayList<String>();
		orgNames.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Organizations, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				  orgNames.add(resultSet.getString("OrganizationName"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return orgNames;
	}

	@Override
	public ArrayList<String> getDistricts() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> districts=new ArrayList<String>();
		districts.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_District, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				  districts.add(resultSet.getString("DistrictName"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return districts;
	}

	@Override
	public ArrayList<String> getPoliceStation() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> policeStations=new ArrayList<String>(); 
		policeStations.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.Get_Police_Station, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				  policeStations.add(resultSet.getString("PoliceStationName"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return policeStations;
	
	}

	@Override
	public void addAttachment(AttachedFile attachedFile, int currentId) throws ServiceException {
		
		List<String> values = new ArrayList<String>();
		values.add(attachedFile.getFileName());
		values.add(attachedFile.getFileType());
		values.add(attachedFile.getFilePath());
		values.add(Integer.toString(currentId));  
		try {
			if (attachedFile.getFileName() == null || attachedFile.getFileName().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding   Attached file : " + attachedFile);

				 storedProcJdbcDao.callStoredProcForList(Constants.Add_Attached_File, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		
	}

	@Override
	public void addAssetReliseProcess(AssetReliseProcess assetReliseProcess, int currentId) throws ServiceException {
		List<String> values = new ArrayList<String>();
		values.add(assetReliseProcess.getAssetReliseProcess()); 
		values.add(assetReliseProcess.getAssetReliseDate());
		values.add(Integer.toString(currentId));  
		try {
			if (assetReliseProcess.getAssetReliseProcess() == null || assetReliseProcess.getAssetReliseProcess().isEmpty())
				System.out.print("No data found ");
			else {
				logger.info("Adding   Remark Info new case : " + assetReliseProcess);

				 storedProcJdbcDao.callStoredProcForList(Constants.Asset_Relise, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		

	}

	@Override
	public ArrayList<String> getLawName() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> lawName=new ArrayList<String>(); 
		lawName.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetLawName, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) { 
				  lawName.add(resultSet.getString("law_name"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return lawName;
	}

	@Override
	public ArrayList<String> getTypeOfCrime() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		ArrayList<String> typeOfCrimes=new ArrayList<String>();  
		typeOfCrimes.add("SELECT A VALUE");
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.getTypeOfCrime, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) { 
				  typeOfCrimes.add(resultSet.getString("type_of_crime"));
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return typeOfCrimes;
	}

 	 

}
