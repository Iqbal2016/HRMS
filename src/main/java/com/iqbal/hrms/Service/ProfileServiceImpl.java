package com.iqbal.hrms.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.iqbal.hrms.Model.ProfileVO;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.ProfileService;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;
import com.iqbal.hrms.util.Constants;

public class ProfileServiceImpl implements ProfileService{
		
	private StoredProcJdbcDao storedProcJdbcDao;
	
	@Override
	public void addProfile(ProfileVO profileVO, String createUseruuid) throws ServiceException {
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		
		inParamMap.put("Id",profileVO.getId());
		inParamMap.put("Name",profileVO.getName());
		inParamMap.put("Address",profileVO.getAddress());
		MapSqlParameterSource in = new MapSqlParameterSource(inParamMap);
		
		try {
			storedProcJdbcDao.callStoredProc(Constants.NEW_PROFILE_DETAILS_PROC_1, in);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
	}
	
	@Override
	public void updateProfile(ProfileVO profileVO, String createUseruuid) throws ServiceException {
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("Id", profileVO.getId());
		inParamMap.put("Name", profileVO.getName());
		inParamMap.put("Address",profileVO.getAddress());
		MapSqlParameterSource in = new MapSqlParameterSource(inParamMap);
		
		try {
			storedProcJdbcDao.callStoredProc(Constants.UPDATE_PROFILE_DETAILS_PROC_2, in);
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
		
	}


	
	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public List<String> getAllCustomerId() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getMyCustomerId(String customerid)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
