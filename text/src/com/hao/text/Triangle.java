package com.hao.text;

/**
 * 三角形
 * 
 * @author Administrator
 *
 */
public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
    //周长
	public double getPerimeter(){
		double n = (side1+side2+side3)/2;
		return n;
	}
	//面积
	public double getArea(){
		double n = 0.0;
		double t = 0.0;
		n = (side1+side2+side3)/2;
		t = (n*((n-side1)-(n-side2)-(n-side3)));
		t = Math.abs(t);
		return t;
	}
	public static void main(String[] args) {
         Triangle tri = new Triangle(1,1.5,1);
         System.out.println("周长为"+tri.getPerimeter());
         System.out.println("面积为"+tri.getArea());
	}

}
