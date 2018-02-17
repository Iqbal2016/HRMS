package com.iqbal.hrms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iqbal.hrms.Model.TestBasicInfo;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.interfaces.ProfileService;
import com.iqbal.hrms.interfaces.TestRegistration;

@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(CaseRegistrationController.class);
	
	@Autowired
	private TestRegistration testResister;
	
	@Autowired
	private ProfileService profileService;	
	
	
	@ModelAttribute("testBasicInfo")
	private TestBasicInfo constructTestBasicInfo() {
		return new TestBasicInfo();
	}
	
	
	@RequestMapping(value = "/addProfile", method = RequestMethod.POST)
	public String showInitialInfoForm(Model model) throws ServiceException {
		logger.info("Test page for ..........000...111...222 ");
System.out.println("enter hear..............");
		

		return "createtest";
	}
	@RequestMapping(value = "/savetest", method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("testBasicInfo") TestBasicInfo testBasicInfo,
	    		ModelMap model) throws ServiceException {
	         
		logger.info("Test page for ............123.... ");
		
	        System.out.println("id: " + testBasicInfo.getId());
	        System.out.println("name: " + testBasicInfo.getName());
	        System.out.println("address: " + testBasicInfo.getAddress()); 
	        
	    /*   testBasicInfo.TestBasicInfo(testBasicInfo);
	        
	        String email=testBasicInfo.getAll(testBasicInfo.getId());
	        
	         System.out.println(email); */
	         
	        return "RegistrationSuccess";
	    }

}
