package com.lhz.spring02;
/**
 * 斧头
 * @author HP
 *
 */
public class Aex {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Aex [name=" + name + "]";
	}

	public Aex() {
		System.out.println("斧头");
		this.name = "斧头";
	}
	
	public String getToolName(){
		return "斧头";
	}
	
}
