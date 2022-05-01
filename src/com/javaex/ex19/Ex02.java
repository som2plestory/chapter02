package com.javaex.ex19;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 9;
		
		try {
			System.out.println(intArr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어남");
		}finally {
			System.out.println("finally");
		}
		
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
