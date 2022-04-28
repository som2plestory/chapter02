package com.javaex.ex06;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	
	public Goods() {
		//*****  메모리에 올리는 일(클래스를 인스턴스화)
		/* System.out.println("Goods()"); */
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		//***** 메모리에 올리는 일(클래스를 인스턴스화)
		//추가로직
		this.name = name;
		/* System.out.println("Goods(1)"); */
	}
	
	//메소드 - gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드 - 일반 html(2일)
	public void showInfo() {
		System.out.println("상품이름: "+name);
		System.out.println("가격: "+price);
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price="+price +"]";
	}
}