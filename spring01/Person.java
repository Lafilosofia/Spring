package com.lhz.spring;

public class Person {
	private String personName;
	private Yell yell;
	
	public Yell getYell() {
		return yell;
	}
	
	public void setYell(Yell yell) {
		this.yell = yell;
	}
	
	public Person() {
		this.personName = "lhz";
	}
	
	public void Work(){
		System.out.println(personName + "»√" + yell.getYell() + "»•" );
	}
	
}
