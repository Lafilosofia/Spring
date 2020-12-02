package com.lhz.spring;
/**
 * ¸«Í·
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
		this.name = "¸«Í·";
	}
	
	public String getToolName(){
		return "¸«Í·";
	}
	
}
