package com.lhz.spring;

public class Cat implements Yell{
	public String name;

	public Cat() {
		this.name = "è";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getYell() {
		return "è";
	}
	
}
