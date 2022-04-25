package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count;
	
	//생성자
	public Goods(){
		this.count = count+1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.count = count+1;
	}
	
	public void setCount(int count) {
		this.count = count+1;
	}
	
	public int count() {
		return count;
	}
	
	//메소드 - gs
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: "+name);
		System.out.println("가격: "+price);
		System.out.println("");
	}
	
	public String toString() {
		return "Goods [Name="+name+", Price="+price+", Count="+count+"]";
	}

}
