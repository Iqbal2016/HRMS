package com.iqbal.hrms.interfaces;

import java.util.List;

import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.Model.SearchResultVO;
import com.iqbal.hrms.exception.ServiceException;

public interface SearchResult {
	
	public List<SearchResultVO> searchByDate(ReportRequestVO reportRequestVO) throws ServiceException;
	
	public List<SearchResultVO> searchByBattalionAndCompany(ReportRequestVO reportRequestVO) throws ServiceException;
	
	public List<SearchResultVO> searchByCrime(ReportRequestVO reportRequestVO) throws ServiceException;
	
	public List<SearchResultVO> getAllCase()throws ServiceException; 
	
}
