package com.hao.text;

//空调测试类
public class ConditionTest {

	public static void main(String[] args) {
           GreeAirCon gree = new GreeAirCon("一般","前后");
           gree.turnOn();
           gree.print();
           gree.turnWind("强", "左右");
           gree.turnOff();
	}

}
