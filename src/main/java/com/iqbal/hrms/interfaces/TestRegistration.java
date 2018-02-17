package com.iqbal.hrms.interfaces;


import com.iqbal.hrms.Model.TestBasicInfo;
import com.iqbal.hrms.exception.ServiceException;

public interface TestRegistration {
	
	public void testRegistration(TestBasicInfo testBasicInfo) throws ServiceException;
	
	 

	 String getAll(String userName) throws ServiceException;

	 public int addNewTest(TestBasicInfo testBasicInfo) throws ServiceException;

	//String addNewTest(TestBasicInfo testBasicInfo) throws ServiceException;
}
