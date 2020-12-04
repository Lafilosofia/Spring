package com.lhz.spring;

public class Dog implements Yell{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog() {
		this.name = "นท";
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	@Override
	public String getYell() {
		// TODO Auto-generated method stub
		return "นท";
	}
	
	
}
