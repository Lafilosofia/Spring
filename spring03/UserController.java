package com.lhz.login.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.lhz.login.entry.User;
import com.sun.java_cup.internal.runtime.virtual_parse_stack;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("toLogin");
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request){
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(name + "," + password);
		System.out.println("login()");
		return "success";
	}
	
	//��������������������βζ�Ӧ�Ĺ�ϵ
	@RequestMapping("/login2.do")
	public String login2(String username,/*@RequestParam("password")*/String pwd){
		System.out.println("login2()");
		System.out.println(username + "," + pwd);
		return "success";
	}
	
	@RequestMapping("/login3.do")
	public String login3(User user){
		String name = user.getUsername();
		String pwd = user.getPassword();
		System.out.println("login3()");
		System.out.println(name + "," + pwd);
		return "success";
	}
	
	@RequestMapping("/login5.do")
	public ModelAndView login5(){
		return null;
		
	}
	
	
	@RequestMapping("/login6.do")
	public String login6(User user,ModelMap map){
		String userName = user.getUsername();
		//DispatcherServlet����AddAttribute�İ���("username")��Ϊ���� ,�����ݰ󶨵�request��
		map.addAttribute("username",userName);
		return "success";
	}
	
	@RequestMapping("/login7.do")
	public String login7(User user,HttpSession session){
		String userName = user.getUsername();
		session.setAttribute("username", userName);
		return "success";
	}
	
	//����String���͵��ض���
	@RequestMapping("/login8.do")
	public String login8(User user){
		String userName = user.getUsername();
		System.out.println("userName" + userName);
		//�ض���ؼ���"redirect:�����ַ
		return "redirect:toSuccess.do";
	}
	@RequestMapping("/toSucess.do")
	public String toSuccess(){
		return "success";
	}
	
	//����ModelAndView���͵��ض���
	@RequestMapping("/login9.do")
	public ModelAndView login9(){
		//�����ض�����ͼ����
		RedirectView redirectView = new RedirectView("toSuccess.do");
		ModelAndView modelAndView = new ModelAndView(redirectView);
		return modelAndView;
	}
	
}
