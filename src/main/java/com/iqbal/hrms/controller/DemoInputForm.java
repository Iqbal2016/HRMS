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

import com.iqbal.hrms.Model.User;
import com.iqbal.hrms.exception.ServiceException;
import com.iqbal.hrms.interfaces.testInterface;

@Controller
public class DemoInputForm {
	
	@Autowired
	private testInterface tInterface;
	
	private static final Logger logger = LoggerFactory.getLogger(DemoInputForm.class);
	
	@ModelAttribute("user")
	public User constructUser() {
		return new User();
	}
	
	
	 @RequestMapping(value = "/inputDemo", method = RequestMethod.GET)
		public String home( Model model) {
		 
			 logger.info("inserting demo inputDemo");
			
			return "inputDemo"; 
		}
	 
	 
	 @RequestMapping(method = RequestMethod.POST,value = "/register")
	    public String processRegistration(@ModelAttribute("user") User user,
	    		ModelMap model) throws ServiceException {
	         
	        
	        System.out.println("username: " + user.getUsername());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail()); 
	        System.out.println("profession: " + user.getProfession());
	        
	        tInterface.testInsert(user);
	        
	        String email=tInterface.getAll(user.getUsername());
	        
	         System.out.println(email); 
	         
	        return "RegistrationSuccess";
	    }
	 
	 

}
