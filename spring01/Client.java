package com.lhz.spring01;
/**
 * 客户角色
 * @author HP
 *
 */

//要租房子的对象
public class Client {
	public static void main(String[] args) {
		/*Host host = new Host();
		host.rent();*/
		
		//客户去到代理
		Host host = new Host();
		//代理
		Proxy proxy = new Proxy();
		//代理房东对象
		proxy.setHost(host);
		//代理出租房子
		host.rent();
	}
}
