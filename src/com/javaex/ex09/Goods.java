package com.javaex.ex09;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods(){
	}
	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
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
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: "+name);
		System.out.println("가격: "+price);
		System.out.println("");
	}
	
	public String toString() {
		return "Goods [Name="+name+", Price="+price+"]";
	}

}
