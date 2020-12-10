package com.lhz.spring02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;

	
	public User() {
		System.out.println("构造方法");
	}

	public String getUsername() {
		return username;
	}

	@Value("admin")
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
	
}
