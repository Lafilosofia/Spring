package com.lhz.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		//Spring������,��������Ҫ����һ��Spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Spring������ȡbean��Ψһ��ʶ��
		Student student = (Student)applicationContext.getBean("stu");
		
	}
	
	
}
