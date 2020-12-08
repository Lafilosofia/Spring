package com.lhz.spring02;
/**
 * 电锯
 * @author HP
 *
 */
public class Saw implements Tool{
	private String name;

	public Saw() {
		System.out.println("电锯");
		this.name = "电锯";
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
		return "电锯";
	}
	
}
