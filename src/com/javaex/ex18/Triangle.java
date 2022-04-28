package com.javaex.ex18;

public class Triangle extends Shape implements Drawable{
	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Triangle() {
		super();
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	
	//메소드 - gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", "
							+ "가로:"+width+", 세로:"+height+" 삼각형]을 그렸습니다.");
	}
	
	public double area() {
		double area = width*height/2;
		return area;
	}
}
