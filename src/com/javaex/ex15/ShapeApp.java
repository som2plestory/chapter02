package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		/*
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01.toString());
		s01.draw();
		*/
		
		Rectangle r01 = new Rectangle("빨강", "검정", 4,6);
		Rectangle r02 = new Rectangle("파랑", "검정", 4,4);
		
		rArray[0] = r01;
		rArray[1] = r02;
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("분홍", "검정", 5);
		
		cArray[0] = c01;
		cArray[1] = c02;
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i].toString());
		}
		
		
		Triangle t01 = new Triangle("빨강", "검정", 6, 4);
		Triangle t02 = new Triangle("보라", "검정", 4, 4);
		
		tArray[0] = t01;
		tArray[1] = t02;
		for(int i=0; i<rArray.length; i++) {
			System.out.println(tArray.toString());
		}
		
	}
	
}
