package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods computer = new Goods("LG그램", 900000);
		//Goods camera = new Goods("니콘", 400000);
		
		Goods computer = new Goods("LG그램", 900000);
		
		Goods camera = new Goods("니콘");
		camera.setPrice(40000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
	}

}