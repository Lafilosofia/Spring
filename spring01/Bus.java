package com.lhz.spring01;

public class Bus {
	private String name;

	public Bus() {
		System.out.println("����Bus���췽��");
	}
	
	public void run(){
		System.out.println("������");
	}
	
	public void destroy(){
		System.out.println("�ݻ���");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + "]";
	}
	
}
