package com.hao.text;

/**
 * 美的空凋
 * 
 * @author Administrator
 *
 */
public class MideaCon extends AirCondition implements AirConditionControl {

	public MideaCon() {
		super();
	}

	public MideaCon(String windPow, String windDire) {
		super(windPow, windDire);
	}
    
	public void print() {
		System.out.println("现在风力是" + super.getWindPow() + ",现在风向是" + super.getWindDire());
	}
	 
	@Override
	public void turnWind(String pow,String dire) {
		if (pow.equals("弱")) {
			super.setWindPow("弱力");
			System.out.println("现在风力为" + super.getWindPow());
		} else if (pow.equals("一般")) {
			super.setWindPow("一般力");
			System.out.println("现在风力为" + super.getWindPow());
		} else if (pow.equals("强")) {
			super.setWindPow("强力");
			System.out.println("现在风力为" + super.getWindPow());
		}
		if (dire.equals("前后")) {
			super.setWindDire("前后摆");
			System.out.println("现在风向为" + super.getWindDire());
		} else if (dire.equals("左右")) {
			super.setWindDire("左右摆");
			System.out.println("现在风向为" + super.getWindDire());
		}
	}

	@Override
	public void turnOn() {
		System.out.println("美的空调已打开...");
	}

	@Override
	public void turnOff() {
		System.out.println("美的空调已关闭...");
	}

}
