package com.javaex.ex08;

public class TVApp {
	
	public static void main(String[] args) {
		TV tv = new TV(7, 20,false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120); //100으로 유지
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);;
		tv.status();
	}

}
