package com.lhz.spring01;
/**
 * 真实角色
 * @author HP
 *
 */

//房东
public class Host implements Rent{

	@Override
	public void rent() {
		System.out.println("房东要租房子");
		
	}
	
}
