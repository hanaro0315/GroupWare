package sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//로그인 구현
@Controller
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping(value="/login")
	public String login() {
		return "loginPage.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/loginCheck")
	public String checkLogin() {
		
		String value="validation check??";
		return value;
	}
	
}
