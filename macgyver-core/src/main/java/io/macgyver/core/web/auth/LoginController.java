package io.macgyver.core.web.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
public class LoginController {

	
	
		@RequestMapping("/login")
		@ResponseBody
		public ModelAndView home() {
			
		
			ModelAndView m = new ModelAndView("auth/login.rythm");
			return m;
			
		}
	
	
}