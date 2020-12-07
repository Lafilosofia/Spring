package com.lhz.spring;

public class Test02 {
	public static void main(String[] args) {
		Person person = new Person();
		Cat cat = new Cat();
		person.setYell(cat);
		person.Work();
	}
}
