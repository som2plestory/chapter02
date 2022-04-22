package com.javaex.ex04;

public class Point {
	
	//필드
	int x, y;
	
	//생성자
	public Point() {
		//메모리에 올리는 일
	}
	
	public Point(int x) {
		this.x=x;
	}
	
	public Point(int x,int y) {
		//메모리에 올리는 일
		this.x=x;
		this.y=y;
	}
	
	//메소드 - gs
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	
	//메소드 - 일반
	public void draw(	) {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
	/*
	public void delete() {
		System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
	}
	*/
	
	public void draw(boolean action) {
		if(action ==true) {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
		}
	}

}
