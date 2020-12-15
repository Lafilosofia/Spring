package com.lhz.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Hello {
	@RequestMapping("/hello.do")
	public void hello(){
		Integer.parseInt("123abc");
	}
	
	@ExceptionHandler
	public String handler(Exception exception){
		if (exception instanceof NumberFormatException) {
			return "error1";
		}else if (exception instanceof StringIndexOutOfBoundsException) {
			return "error2";
		}
		return null;  
	}
	
	@RequestMapping("/hello2.do")
	public void hello2(){
		String string = "";
		string.charAt(2);
	}
}
