package com.learn.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WelcomeController {
	
	//private Logger logger=LoggerFactory.getLogger(getClass());
	
	//private AuthenticationService authenticationService;
	
	
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		
		model.put("name",getLoggedInUsername());
		//logger.debug("Request param is at debug level {} ",name);
		//logger.info("Request param is at info level {} ",name);
		//logger.warn("Request param is at warn level {}",name);
		//System.out.println("Request param is "+name);//not recommende	
		return "Welcome";
	}
	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password,ModelMap model) {
//		
//
//		 if(authenticationService.authenticate(name, password)) {
//			 model.put("name",name);
//			 return "Welcome";	 
//		 }
//		
//		model.put("errorMessage","Invalid Credentials");
//		return "login";
	//}
	
	private String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
