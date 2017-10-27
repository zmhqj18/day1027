package com.hao.text;

/**
 * 空凋
 * 
 * @author Administrator
 *
 */
public abstract class AirCondition {
	private String windPow; // 风力
	private String windDire; // 风向
	private int REFRIGERATION = 16; // 制冷参数
	private int KW = 1200; // 功率参数

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

	// 调整风力风向方法
	public abstract void turnWind(String pow, String dire);

}
