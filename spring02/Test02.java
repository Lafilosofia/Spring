package com.lhz.spring02;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
	/*@Test
	public void test01(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Man man = (Man)applicationContext.getBean("m");
		man.Work();
	}*/
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Man man = (Man)applicationContext.getBean("m");
		man.Work();
	}
}
