package com.lhz.spring;
/**
 * ��ͷ
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
		this.name = "��ͷ";
	}
	
	public String getToolName(){
		return "��ͷ";
	}
	
}
