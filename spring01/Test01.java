package com.lhz.spring;
/**
 * 测试
 * @author HP
 *
 */
public class Test01 {
	public static void main(String[] args) {
		/* 在我们之前的业务中,用户需求可能会影响我们原来的代码,我们需要
		 * 根据用户的需求去修改密码,这样以来程序员代码量十分巨大,修改一次
		 * 的成本代价非常昂贵
		 * 
		 * 我们可以用set方法,来注入相关的对象
		 * 之前,程序员是主动创建对象,控制权在程序员手里
		 * 使用了set注入,程序员不再具有主动权,而是变成了被动的接收对象
		 * 
		 * */
		Man man = new Man();
		Saw saw = new Saw();
		man.setTool(saw);
		man.Work();
		
	}
}
