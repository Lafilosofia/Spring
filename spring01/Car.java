package com.lhz.spring01;

import javax.swing.Spring;

public class Car {
	private Spring name;

	public Spring getName() {
		return name;
	}

	public void setName(Spring name) {
		this.name = name;
	}

	public Car() {
		System.out.println("CarµÄÊµÀý");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
}
