package com.lhz.spring02;
/**
 * ���
 * @author HP
 *
 */
public class Saw implements Tool{
	private String name;

	public Saw() {
		System.out.println("���");
		this.name = "���";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Saw [name=" + name + "]";
	}

	@Override
	public String getToolName() {
		return "���";
	}
	
}
