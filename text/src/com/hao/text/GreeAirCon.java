package com.hao.text;

/**
 * �����յ�
 * 
 * @author Administrator
 *
 */
public class GreeAirCon extends AirCondition implements AirConditionControl {

	public GreeAirCon() {
		super();
	}

	public GreeAirCon(String windPow, String windDire) {
		super(windPow, windDire);
	}

	public void print() {
		System.out.println("���ڷ�����" + super.getWindPow() + ",���ڷ�����" + super.getWindDire());
	}

	@Override
	public void turnWind(String pow, String dire) {
		if (pow.equals("��")) {
			super.setWindPow("����");
			System.out.println("���ڷ���Ϊ" + super.getWindPow());
		} else if (pow.equals("һ��")) {
			super.setWindPow("һ����");
			System.out.println("���ڷ���Ϊ" + super.getWindPow());
		} else if (pow.equals("ǿ")) {
			super.setWindPow("ǿ��");
			System.out.println("���ڷ���Ϊ" + super.getWindPow());
		}
		if (dire.equals("ǰ��")) {
			super.setWindDire("ǰ���");
			System.out.println("���ڷ���Ϊ" + super.getWindDire());
		} else if (dire.equals("����")) {
			super.setWindDire("���Ұ�");
			System.out.println("���ڷ���Ϊ" + super.getWindDire());
		}
	}

	@Override
	public void turnOn() {
		System.out.println("�����յ��Ѵ�...");
	}

	@Override
	public void turnOff() {
		System.out.println("�����յ��ѹر�...");
	}

}
