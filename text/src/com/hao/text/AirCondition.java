package com.hao.text;

/**
 * �յ�
 * 
 * @author Administrator
 *
 */
public abstract class AirCondition {
	private String windPow; // ����
	private String windDire; // ����
	private int REFRIGERATION = 16; // �������
	private int KW = 1200; // ���ʲ���

	public AirCondition() {
	}

	public AirCondition(String windPow, String windDire) {
		this.windPow = windPow;
		this.windDire = windDire;
	}

	public void setREFRIGERATION(int rEFRIGERATION) {
		REFRIGERATION = rEFRIGERATION;
	}

	public void setKW(int kW) {
		KW = kW;
	}

	public String getWindPow() {
		return windPow;
	}

	public void setWindPow(String windPow) {
		this.windPow = windPow;
	}

	public String getWindDire() {
		return windDire;
	}

	public void setWindDire(String windDire) {
		this.windDire = windDire;
	}

	// �����������򷽷�
	public abstract void turnWind(String pow, String dire);

}
