package com.lhz.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		//Spring来管理,在这里需要创建一个Spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Spring容器获取bean的唯一标识符
		Student student = (Student)applicationContext.getBean("stu");
		
	}
	
	
}
