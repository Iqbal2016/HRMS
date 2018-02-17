package com.iqbal.hrms.interfaces;

import java.util.List;

import com.iqbal.hrms.Model.ActivityReportVO;
import com.iqbal.hrms.Model.CrimeReportVO;
import com.iqbal.hrms.Model.ReportData;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.exception.ServiceException;

public interface Report {

	public List<ReportData> reportByDate(ReportRequestVO requestVO) throws ServiceException;

	public List<ReportData> getDashBoardData() throws ServiceException;

	public List<ActivityReportVO> getActivityReport() throws ServiceException;

	public List<CrimeReportVO> getCrimeReportByBattalion() throws ServiceException;

	public List<CrimeReportVO> getCrimeReportByLawName() throws ServiceException;

	public List<CrimeReportVO> getCrimeReportByCrimeType() throws ServiceException;

	public List<CrimeReportVO> ReportSummaryByBattalion(ReportRequestVO requestVO) throws ServiceException;

	public List<CrimeReportVO> ReportSummaryByLawName(ReportRequestVO requestVO) throws ServiceException;

	public List<CrimeReportVO> ReportSummaryByTypeOfCrime(ReportRequestVO requestVO) throws ServiceException;
	
	public List<CrimeReportVO> dateReportByBattalionAll(ReportRequestVO requestVo) throws ServiceException;

	public List<CrimeReportVO> dateReportByLawNameAll(ReportRequestVO requestVo) throws ServiceException;

	public List<CrimeReportVO> dateReportByCrimeType(ReportRequestVO requestVO) throws ServiceException;

}
