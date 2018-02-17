package com.iqbal.hrms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemSettingsController {
	
	private static final Logger logger = LoggerFactory.getLogger(AssetRegistrationController.class);
	
	 
	 @RequestMapping(value = "/addBattalion", method = RequestMethod.GET)
		public String addBattalion( Model model) {
		 
			 logger.info("Showing create Battalion form ");
			
			return "addBattalion";
		}


	 @RequestMapping(value = "/addCompany", method = RequestMethod.GET)
		public String home( Model model) {
		 
			 logger.info("Showing create addCompany form ");
			
			return "addCompany";
		}


}
