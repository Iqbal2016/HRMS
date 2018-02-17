package com.iqbal.hrms.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqbal.hrms.Model.TestBasicInfo;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;
import com.iqbal.hrms.interfaces.TestRegistration;
import com.iqbal.hrms.util.Constants;

public class TestRegistrationImp implements TestRegistration {

	private static final Logger logger = LoggerFactory
			.getLogger(TestRegistrationImp.class);

	private StoredProcJdbcDao storedProcJdbcDao;

	public StoredProcJdbcDao getStoredProcJdbcDao() {
		return storedProcJdbcDao;
	}

	public void setStoredProcJdbcDao(StoredProcJdbcDao storedProcJdbcDao) {
		this.storedProcJdbcDao = storedProcJdbcDao;
	}

	@Override
	public void testRegistration(TestBasicInfo testBasicInfo)
			throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAll(String userName) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addNewTest(TestBasicInfo testBasicInfo) throws ServiceException {

		ResultSet resultSet = null;
		int Id = 0;
		List<String> values = new ArrayList<String>();
		values.add(testBasicInfo.getId());
		values.add(testBasicInfo.getName());
		values.add(testBasicInfo.getAddress());
		try {
			if (testBasicInfo.getId() == null
					|| testBasicInfo.getName().isEmpty())
				System.out.print("No data found............... ");
			else {
				logger.info("Creatin new test : " + testBasicInfo);

				resultSet = storedProcJdbcDao.callStoredProcForList(
						Constants.ADD_NEW_TEST, values);
			}

		} catch (StoredProcException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (resultSet != null) {

			try {
				while (resultSet.next()) {

					Id = resultSet.getInt("Id");
				}
			} catch (SQLException e) {
				throw new ServiceException(e.getMessage(), e);
			}
		}

		return Id;
	}

}
