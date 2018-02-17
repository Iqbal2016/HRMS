package com.iqbal.hrms.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqbal.hrms.util.Constants;
import com.iqbal.hrms.Model.ReportData;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.Model.SearchResultVO;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.SearchResult;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;

public class SearchResultImp implements SearchResult{
	
	private static final Logger logger = LoggerFactory.getLogger(CaseInformationViewImpl.class);

	private StoredProcJdbcDao storedProcJdbcDao;

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public List<SearchResultVO> searchByDate(ReportRequestVO reportRequestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<SearchResultVO> reportList=new ArrayList<SearchResultVO>();
	    
		values.add(reportRequestVO.getStartingDate());
		values.add(reportRequestVO.getEndDate()); 
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.SearchByDate, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				SearchResultVO data=new SearchResultVO(); 
				 
				data.setSerialNumber(resultSet.getString("serailno"));
				data.setCaseNumber(resultSet.getString("caseno")); 
				data.setCaseDate(resultSet.getString("casedate"));
				data.setLawName(resultSet.getString("case_law_name"));
				data.setCaseDhara(resultSet.getString("case_dhara"));
				data.setCaseSystemId(resultSet.getInt("case_systemid"));
				data.setBattalionName(   resultSet.getString("battalion_name"));
				data.setCompanyName(resultSet.getString("company_name")); 
				data.setTypeOfCrime(resultSet.getString("type_of_crime"));
			    reportList.add(data);
				  
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return reportList;

	}

	@Override
	public List<SearchResultVO> searchByBattalionAndCompany(ReportRequestVO reportRequestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<SearchResultVO> reportList=new ArrayList<SearchResultVO>();
	    
		values.add(reportRequestVO.getBattalionName());
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.SearchByBattalionAndCompany, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				SearchResultVO data=new SearchResultVO(); 
				 
				data.setSerialNumber(resultSet.getString("serailno"));
				data.setCaseNumber(resultSet.getString("caseno")); 
				data.setCaseDate(resultSet.getString("casedate"));
				data.setLawName(resultSet.getString("case_law_name"));
				data.setCaseDhara(resultSet.getString("case_dhara"));
				data.setCaseSystemId(resultSet.getInt("case_systemid"));
				data.setBattalionName(   resultSet.getString("battalion_name"));
				data.setCompanyName(resultSet.getString("company_name")); 
				data.setTypeOfCrime(resultSet.getString("type_of_crime"));
				data.setThanaName(resultSet.getString("policestationname"));
			    reportList.add(data);
				  
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return reportList;
	}

	@Override
	public List<SearchResultVO> searchByCrime(ReportRequestVO reportRequestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<SearchResultVO> reportList=new ArrayList<SearchResultVO>();
	    
		values.add(reportRequestVO.getTypeOfCrime());
		values.add(reportRequestVO.getCaseDhara()); 
		values.add(reportRequestVO.getLawName());
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.SearchByCrime, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				SearchResultVO data=new SearchResultVO(); 
				 
				data.setSerialNumber(resultSet.getString("serailno"));
				data.setCaseNumber(resultSet.getString("caseno")); 
				data.setCaseDate(resultSet.getString("casedate"));
				data.setLawName(resultSet.getString("case_law_name"));
				data.setCaseDhara(resultSet.getString("case_dhara"));
				data.setCaseSystemId(resultSet.getInt("case_systemid"));
				data.setBattalionName(   resultSet.getString("battalion_name"));
				data.setCompanyName(resultSet.getString("company_name")); 
				data.setTypeOfCrime(resultSet.getString("type_of_crime"));
			    reportList.add(data);
				  
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return reportList;

	}

	@Override
	public List<SearchResultVO> getAllCase() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<SearchResultVO> reportList=new ArrayList<SearchResultVO>();
	    
		
		try {
		    resultSet = storedProcJdbcDao.callStoredProcForList(Constants.getAllCase, values);
		} catch (StoredProcException e) {
		    throw new ServiceException(e.getMessage(), e);
		}
		
		if (resultSet != null) {
		    try {
		    	 
			while (resultSet.next()) {
				SearchResultVO data=new SearchResultVO(); 
				 
				data.setSerialNumber(resultSet.getString("serailno"));
				data.setCaseNumber(resultSet.getString("caseno")); 
				data.setCaseDate(resultSet.getString("casedate"));
				data.setLawName(resultSet.getString("case_law_name"));
				data.setCaseDhara(resultSet.getString("case_dhara"));
				data.setCaseSystemId(resultSet.getInt("case_systemid"));
				data.setBattalionName(   resultSet.getString("battalion_name"));
				data.setCompanyName(resultSet.getString("company_name")); 
				data.setTypeOfCrime(resultSet.getString("type_of_crime"));
			    reportList.add(data);
				  
			 }
		    } catch (SQLException e) {
			throw new ServiceException(e.getMessage(), e);
		    }
		} 
		
		return reportList;
	}

}
