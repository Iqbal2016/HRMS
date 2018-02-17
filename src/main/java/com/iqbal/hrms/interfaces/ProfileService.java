package com.iqbal.hrms.interfaces;

import java.util.List;

import com.iqbal.hrms.Model.ProfileVO;
import com.iqbal.hrms.exception.ServiceException;

public interface ProfileService {

      public void addProfile(ProfileVO profileVO, String createUseruuid) throws ServiceException;	
      public void updateProfile(ProfileVO profileVO, String createUseruuid) throws ServiceException;	
	  //public List<ProfileVO> searchProfile(String customerid, SearchProfileVo SearchProfileVO) throws ServiceException;	 
	  public List<String> getAllCustomerId() throws ServiceException;
	  public List<String> getMyCustomerId(String customerid) throws ServiceException;
	


}


