package com.lhz.spring;
/**
 * ����
 * @author HP
 *
 */
public class Test01 {
	public static void main(String[] args) {
		/* ������֮ǰ��ҵ����,�û�������ܻ�Ӱ������ԭ���Ĵ���,������Ҫ
		 * �����û�������ȥ�޸�����,������������Ա������ʮ�־޴�,�޸�һ��
		 * �ĳɱ����۷ǳ�����
		 * 
		 * ���ǿ�����set����,��ע����صĶ���
		 * ֮ǰ,����Ա��������������,����Ȩ�ڳ���Ա����
		 * ʹ����setע��,����Ա���پ�������Ȩ,���Ǳ���˱����Ľ��ն���
		 * 
		 * */
		Man man = new Man();
		Saw saw = new Saw();
		man.setTool(saw);
		man.Work();
		
	}
}
