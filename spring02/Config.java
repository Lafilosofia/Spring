package com.lhz.spring02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.w3c.dom.UserDataHandler;

/**
 * 配置文件类
 * @Configuration 该注解是配置文件类的注解
 * 通用组件
 * 
 * @author HP
 *
 */

@Configuration
@ComponentScan("com.lhz.spring02")
@Import(Config.class)
public class Config {
	/*
	 * @Bean代表配置文件中的bean标签
	 * bean的id就是方法的名字
	 * class就是返回值的对象
	 */
	@Bean
	public User getUser(){
		return new User();
	}
	
}
