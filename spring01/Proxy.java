package com.lhz.spring01;
/**
 * �����ɫ
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
	
	//������
	public void seeHouse(){
		System.out.println("���ͻ�ȥ������");
	}
	
	//�ɽ�
	public void deal(){
		System.out.println("���ӳɽ���");
	}

}
