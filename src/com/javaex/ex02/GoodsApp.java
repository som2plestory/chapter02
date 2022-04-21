package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		Goods notebook = new Goods();
		notebook.name = "LG그램";
		notebook.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("상품이름: "+camera.name+" 가격: " +camera.price);
		System.out.println("상품이름: "+notebook.name+" 가격: " +notebook.price);
		System.out.println("상품이름: "+cup.name+" 가격: " +cup.price);
	}

}
