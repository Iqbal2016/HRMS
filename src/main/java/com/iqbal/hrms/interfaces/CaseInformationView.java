package com.iqbal.hrms.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.iqbal.hrms.Model.AssetReliseProcess;
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

public interface CaseInformationView {

	public CaseBasicInfo getCaseInfo(int currentId) throws ServiceException;

	public ArrayList<RequesterInfo> getRequester(int currentId) throws ServiceException;

	public ArrayList<DefulderInformation> getDefulderInformation(int currentId) throws ServiceException;

	public ArrayList<SeizedAssetDetails> getSeizedAssetDetails(int currentId) throws ServiceException;

	public ArrayList<InvestigationOrganizationInfo> getInvestigationInfo(int currentId) throws ServiceException;

	public ArrayList<InvestigationResult> getInvestigationResult(int currentId) throws ServiceException;

	 public  CourtOrder  getCourtOrder (int currentId)throws
	   ServiceException;
	 
	 public  CaseRemark  getCaserRemark (int currentId)throws
	 ServiceException;
	 
	  public  AssetReliseProcess getAssetReliseProcess(int currentId) throws ServiceException;
		

	 public  String  getCompanyByBattalion(String battalionName)throws ServiceException;
	 
	 public  String  getThanaByDist(String distName)throws ServiceException;
		
	 
	 public String getCompanyName(int companyId) throws ServiceException;

	public String getBattalionName(int battlionId) throws ServiceException;

}
