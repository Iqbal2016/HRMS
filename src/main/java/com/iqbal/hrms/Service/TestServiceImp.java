package com.iqbal.hrms.Service;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iqbal.hrms.util.Constants;
import com.iqbal.hrms.Model.User;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;
import com.iqbal.hrms.interfaces.testInterface;

public class TestServiceImp implements testInterface {

	private StoredProcJdbcDao storedProcJdbcDao;

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public void testInsert(User user) throws ServiceException {
		List<String> values = new ArrayList<String>();
		values.add(user.getUsername());
		values.add(user.getPassword());
		values.add(user.getEmail());
		values.add(user.getProfession());

		
		System.out.println(user.getUsername() + " "+ user.getPassword()+" "+ user.getEmail()+ " "+user.getProfession() );
		ResultSet resultSet = null;
		try {
			if (user.getUsername() == null || user.getUsername().isEmpty())
				System.out.print("No user name ");
			else
				resultSet = storedProcJdbcDao.callStoredProcForList(Constants.InsertDemo, values);
			System.out.println("insert successful");
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

	}

	@Override
	public String getAll(String userName) throws ServiceException {
		List<String> values = new ArrayList<String>();
		String email=" no value";
		values.add(userName);

		ResultSet resultSet = null;
		try {
			if (userName == null || userName.isEmpty())
				System.out.print("No user name ");
			else
				resultSet = storedProcJdbcDao.callStoredProcForList(Constants.GetByEmail, values);
			System.out.println("insert successful");
		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		
		if(resultSet != null){
			 
			try {
				while (resultSet.next()) {
					 
					  email=resultSet.getString("email");
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
			
			
		}
		
		return email;
	}


}
