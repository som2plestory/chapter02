package com.javaex.ex20;

import java.io.IOException;

public class MyFile {
	
	//필드
	
	//생성자
	public MyFile() {
		
	}
	
	
	//메소드 gs
	
	//메소드 일반
	//정상적인 경우
	public String read(String path) {
		//path에 있는 파일을 ㅇ릭어서 문자열 만들어준다
		String result = "학교종이 땡땡땡 어서 모이자";
		
		return result;
	}
	
	//파일이 없는 경우 -- 만드는 쪽에서 예외처리 하는 경우
	public String read2(String path) {
		String result ="";
		
		/*
		try {
			//path에 잇는 파일을 읽어서 문자열 만들어준다
			//파일이 없을때
			throw new IOException(); //파일이 없는 상황을 강제로 발생
		}catch(IOException e) {
			System.out.println(path + " no file ");
		}catch(NullPointerException e) {
			System.out.println("널포인트");
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		return result;

	}
	*/
	
	try {
		//path에 있는 파일을 읽어서 문자열 만들어준다
		//파일이 없을때
		throw  new  IOException();  //파일이 없는 상황을 강제로 발생   
		
	} catch (Exception e) {
		System.out.println(path + " no file ");
	} 
	
	return result;
	}
	
	//파일이 없는 경우 - 사용하는 쪽에 예외를 알리는 경우
	public String read3(String path) throws IOException{
		String result ="";
		
			throw new IOException(); //파일이 없는 상황을 강제로 발생

	}
	
	
}
