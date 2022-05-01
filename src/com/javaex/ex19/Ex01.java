package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double result;
		int num;
		
		num = sc.nextInt();
		result = 100/num; //예외상황발생
		
		try {
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally영역");
		}
		
		System.out.println(result);
		
		sc.close();
		
	}

}
