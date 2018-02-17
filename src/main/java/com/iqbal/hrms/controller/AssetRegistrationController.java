package com.iqbal.hrms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AssetRegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(AssetRegistrationController.class);
	  
	 @RequestMapping(value = "/showAssetRegistrationForm", method = RequestMethod.GET)
		public String home( Model model) {
		 
			 logger.info("Showing Asset regisgration form ");
			
			return "ARform";
		}

}
