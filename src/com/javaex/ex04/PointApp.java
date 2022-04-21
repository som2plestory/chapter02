package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point five_five = new Point();
		five_five.setterX(5);
		five_five.setterY(5);
		
		Point ten_twentyThree = new Point();
		ten_twentyThree.setterX(10);
		ten_twentyThree.setterY(23);

		five_five.draw();
		ten_twentyThree.draw();
	}

}
