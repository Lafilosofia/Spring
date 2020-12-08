package com.lhz.spring02;

import java.io.Serializable;

public class Student implements Serializable{
	private String userName;

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Student [name=" + userName + "]";
	}

	public Student() {
		System.out.println("这是学生类的构造方法");
	}
	
}
