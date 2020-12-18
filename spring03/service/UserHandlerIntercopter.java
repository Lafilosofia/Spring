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
		System.out.println("��֤��ʼ...");
		//��ȡsession����
		HttpSession session = request.getSession();
		//ͨ��session��ȡ������
		User user = (User)session.getAttribute("user");
		if (user == null) {		//�û�û�е�¼,��Ҫ����
			//�ض���
			response.sendRedirect(request.getContextPath() + "/user/toLogin.do");
			return false;
		}
		//�û���¼�ɹ� ������
		return true;
	}

	
	//������ɹ�֮���ڷ���ҳ��֮ǰִ�и�postHandle����
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("PostHandle");
		
	}

	
	//���������󷵻�ҳ��ɹ�֮��ִ�и÷���
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion");
	}

}
