package com.hao.text;

//�յ�������
public class ConditionTest {

	public static void main(String[] args) {
           GreeAirCon gree = new GreeAirCon("һ��","ǰ��");
           gree.turnOn();
           gree.print();
           gree.turnWind("ǿ", "����");
           gree.turnOff();
	}

}
