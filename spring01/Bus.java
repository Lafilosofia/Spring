package com.lhz.spring01;

public class Bus {
	private String name;

	public Bus() {
		System.out.println("这是Bus构造方法");
	}
	
	public void run(){
		System.out.println("启动了");
	}
	
	public void destroy(){
		System.out.println("摧毁了");
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
