package com.iqbal.hrms.Service;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iqbal.hrms.util.Constants;
import com.iqbal.hrms.Model.ActivityReportVO;
import com.iqbal.hrms.Model.CrimeReportVO;
import com.iqbal.hrms.Model.ReportData;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.Report;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;

public class ReportImp implements Report {

	private StoredProcJdbcDao storedProcJdbcDao;

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public List<ReportData> reportByDate(ReportRequestVO requestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<ReportData> reportList = new ArrayList<ReportData>();

		values.add(requestVO.getStartingDate());
		values.add(requestVO.getEndDate());
		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ReportByDate, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					ReportData data = new ReportData();

					data.setBattalionName(resultSet.getString("battalion_name"));
					data.setLawName(resultSet.getString("law_name"));
					data.setTotalCount(resultSet.getInt("total_count"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;
	}

	@Override
	public List<ReportData> getDashBoardData() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<ReportData> reportList = new ArrayList<ReportData>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.DashBoardData, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					ReportData data = new ReportData();

					data.setBattalionName(resultSet.getString("battalion_name"));
					data.setLawName(resultSet.getString("law_name"));
					data.setTotalCount(resultSet.getInt("total_count"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;
	}

	@Override
	public List<ActivityReportVO> getActivityReport() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<ActivityReportVO> reportList = new ArrayList<ActivityReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ActivityReport, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					ActivityReportVO data = new ActivityReportVO();

					data.setSerialNo(resultSet.getString("serailno"));
					data.setCaseNumber(resultSet.getString("caseno"));
					data.setCaseDate(resultSet.getString("casedate"));
					data.setLawName(resultSet.getString("case_law_name"));
					data.setCaseDhara(resultSet.getString("case_dhara"));
					data.setCompanyName(resultSet.getString("company_name"));
					data.setBattalionName(resultSet.getString("battalion_name"));

					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;
	}

	@Override
	public List<CrimeReportVO> getCrimeReportByBattalion() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.CrimeReportByBattalion, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();

					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
					data.setCompanyName(resultSet.getString("compName"));

					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;

	}

	@Override
	public List<CrimeReportVO> getCrimeReportByLawName() throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.CrimeReportByLawName, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
					data.setLawName(resultSet.getString("case_law_name"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;

	}

	@Override
	public List<CrimeReportVO> getCrimeReportByCrimeType() throws ServiceException {
		
		
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.CrimeReportByTypeOfCrime, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
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
	public List<CrimeReportVO> ReportSummaryByBattalion(ReportRequestVO requestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getBattalionName());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ReportSummaryByBattalion, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();

					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
					data.setCompanyName(resultSet.getString("compName"));

					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;
	}

	@Override
	public List<CrimeReportVO> ReportSummaryByLawName(ReportRequestVO requestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getBattalionName());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ReportSummaryByLawName, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
					data.setLawName(resultSet.getString("case_law_name"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;
	}

	@Override
	public List<CrimeReportVO> ReportSummaryByTypeOfCrime(ReportRequestVO requestVO) throws ServiceException {

		
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getBattalionName());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.ReportSummaryByTypeOfCrime, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setBattalionName(resultSet.getString("BatName"));
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
	public List<CrimeReportVO> dateReportByBattalionAll(ReportRequestVO requestVO) throws ServiceException {

		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getStartingDate());
		values.add(requestVO.getEndDate());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.DateSummaryForBattalionName, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setCaseDate(resultSet.getString("casedate"));
					data.setBattalionName(resultSet.getString("BatName"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;

	}

	@Override
	public List<CrimeReportVO> dateReportByLawNameAll(ReportRequestVO  requestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getStartingDate());
		values.add(requestVO.getEndDate());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.DateSummaryForLawName, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setCaseDate(resultSet.getString("casedate"));
					data.setLawName(resultSet.getString("case_law_name"));
					reportList.add(data);

				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return reportList;

	}

	@Override
	public List<CrimeReportVO> dateReportByCrimeType(ReportRequestVO requestVO) throws ServiceException {
		ResultSet resultSet = null;
		List<String> values = new ArrayList<String>();
		values.add(requestVO.getStartingDate());
		values.add(requestVO.getEndDate());
		List<CrimeReportVO> reportList = new ArrayList<CrimeReportVO>();

		try {
			resultSet = storedProcJdbcDao.callStoredProcForList(Constants.DateSummaryForCrimeType, values);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {
			try {

				while (resultSet.next()) {
					CrimeReportVO data = new CrimeReportVO();
					data.setTotalCaseNo(resultSet.getInt("totalcase"));
					data.setCaseDate(resultSet.getString("casedate"));
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
