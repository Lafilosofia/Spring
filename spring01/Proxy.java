package com.lhz.spring01;
/**
 * 代理角色
 * @author HP
 *
 */
public class Proxy implements Rent{
	private Host host;
	
	@Override
	public void rent() {
		seeHouse();
		host.rent();
		deal();
		
	}

	public void setHost(Host host) {
		this.host = host;
	}
	
	//看房子
	public void seeHouse(){
		System.out.println("带客户去看房子");
	}
	
	//成交
	public void deal(){
		System.out.println("房子成交了");
	}

}
