package com.iqbal.hrms.interfaces;

import com.iqbal.hrms.Model.User;
import com.iqbal.hrms.exception.ServiceException;

public interface testInterface {
	
	public void testInsert(User user) throws ServiceException;
	
 

	 String getAll(String userName) throws ServiceException;

}
