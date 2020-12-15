package com.lhz.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lhz.login.entity.User;
import com.lhz.login.service.AppException;
import com.lhz.login.service.UserService;

/**
 * ���Ʋ�
 * @author HP
 *
 */

@Controller
@RequestMapping("user")
public class UserController {
	//ע��ҵ���
	@Resource
	private UserService service;
	
	//��½ҳ��
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("toLogin()");
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String login(User user,HttpServletRequest request,HttpSession session){
		try {
			System.out.println(user.getUserName() + "," + user.getUserPassword());
			User u = service.checkUserLogin(user);
			session.setAttribute("user", u);
		} catch (Exception e) {
			if (e instanceof AppException) {
				//���쳣��Ϣ��ǰ��
				request.setAttribute("message",e.getMessage());
				return "login";
			}
			
			if (e instanceof AppsException) {
				request.setAttribute("message2",e.getMessage());
				return "login";
			}
		}
		
		return "success";
	}
	
	@RequestMapping("/success.do")
	public String success(){
		System.out.println("success()");
		return "success";
	}
}
