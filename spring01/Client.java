package com.lhz.spring01;
/**
 * �ͻ���ɫ
 * @author HP
 *
 */

//Ҫ�ⷿ�ӵĶ���
public class Client {
	public static void main(String[] args) {
		/*Host host = new Host();
		host.rent();*/
		
		//�ͻ�ȥ������
		Host host = new Host();
		//����
		Proxy proxy = new Proxy();
		//����������
		proxy.setHost(host);
		//������ⷿ��
		host.rent();
	}
}
