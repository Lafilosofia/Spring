package com.lhz.login.intercop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lhz.login.entity.User;

public class UserHandlerIntercopter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("验证开始...");
		//获取session对象
		HttpSession session = request.getSession();
		//通过session获取绑定数据
		User user = (User)session.getAttribute("user");
		if (user == null) {		//用户没有登录,需要拦截
			//重定向
			response.sendRedirect(request.getContextPath() + "/user/toLogin.do");
			return false;
		}
		//用户登录成功 不拦截
		return true;
	}

	
	//在请求成功之后在返回页面之前执行该postHandle方法
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("PostHandle");
		
	}

	
	//被拦截请求返回页面成功之后执行该方法
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion");
	}

}
