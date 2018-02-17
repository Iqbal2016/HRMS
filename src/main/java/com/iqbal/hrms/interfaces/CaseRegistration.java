package com.iqbal.hrms.interfaces;

 
import java.util.ArrayList;

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

public interface CaseRegistration {
	
	public int addNewCase(CaseBasicInfo caseBasicInfo) throws ServiceException;

	public void addDefulderInformation(DefulderInformation defulderInformation,int currentId)throws ServiceException; 

	public void addInvestigationInfo (InvestigationOrganizationInfo organizationInfo,int currentId)throws ServiceException; 

	public void addInvestigationResult (InvestigationResult result,int currentId)throws ServiceException; 

	public void addSeizedAssetDetails (SeizedAssetDetails assetDetails,int currentId)throws ServiceException; 

	public void addRequester (RequesterInfo requesterInfo,int currentId)throws ServiceException; 
	
	public void addCourtOrder (CourtOrder courtOrder,int currentId)throws ServiceException; 
	
	public void addCaserRemark (CaseRemark  remark,int currentId)throws ServiceException;   
	
	public void addAttachment(AttachedFile  attachedFile,int currentId)throws ServiceException;
	
	public void addAssetReliseProcess(AssetReliseProcess  assetReliseProcess,int currentId)throws ServiceException;
	 
	public ArrayList<String> getCompanyNames() throws ServiceException;
	
	public ArrayList<String> getBattalionNames() throws ServiceException;
	
	public ArrayList<String> getOrganizations() throws ServiceException;
	
	public ArrayList<String> getDistricts() throws ServiceException;
	
	public ArrayList<String> getPoliceStation() throws ServiceException;
	
	public ArrayList<String> getLawName() throws ServiceException;
	
	public ArrayList<String> getTypeOfCrime() throws ServiceException;

}
