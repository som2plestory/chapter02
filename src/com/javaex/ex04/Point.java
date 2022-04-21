package com.javaex.ex04;

public class Point {
	
	//필드
	int x, y;
	
	//생성자
	
	//메소드 - gs
	public void setterX(int i) {
		x = i;
	}
	
	public void setterY(int j) {
		y = j;
	}
	
	public int getterX() {
		return x;
	}
	
	public int getterY() {
		return y;
	}
	
	
	//메소드 - 일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}

}
