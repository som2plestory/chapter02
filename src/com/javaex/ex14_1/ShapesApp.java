package com.javaex.ex14_1;

public class ShapesApp {
	
	public static void main(String[] args) {
		
		//[] angles4 = new String[2]; //4각형
		Ractangle r01 = new Ractangle("빨강", "검정", 4,4);
		Ractangle r02 = new Ractangle("주황", "검정", 5,5);
		r01.draw();
		r02.draw();
		
		
		
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);
		t01.draw();
		t02.draw();
		
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		c01.draw();
		c02.draw();
		
	}

}
