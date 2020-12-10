package com.lhz.spring02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.w3c.dom.UserDataHandler;

/**
 * �����ļ���
 * @Configuration ��ע���������ļ����ע��
 * ͨ�����
 * 
 * @author HP
 *
 */

@Configuration
@ComponentScan("com.lhz.spring02")
@Import(Config.class)
public class Config {
	/*
	 * @Bean���������ļ��е�bean��ǩ
	 * bean��id���Ƿ���������
	 * class���Ƿ���ֵ�Ķ���
	 */
	@Bean
	public User getUser(){
		return new User();
	}
	
}
