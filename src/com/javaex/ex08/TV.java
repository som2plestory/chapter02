package com.javaex.ex08;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel=7;
		this.volume=20;
		this.power=false;
	}
	
	
	//메소드 - gs
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	
	//메소드 - 일반
	public void power(boolean on) {
		if(on==true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if(power==true && (channel>=1 && channel<=255)) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {
			if(this.power==true && this.channel<255) {
				this.channel++;
			}
		}else {
			if(this.power==true && this.channel>0) {
				this.channel--;
			}
		}
	}
	
	public void volume(int volume) {
		if(this.power==true && (volume>=0 && volume<=100)) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if(up==true) {
			if(this.power==true && volume<100) {
				this.volume++;
			}
		}else {
			if(this.power==true && volume>0) {
				this.volume--;
			}
		}
	}
	
	public void status() {
		System.out.print("channel="+channel+", volume="+volume);
		if(power==true) {
			System.out.println(", TV: ON");
		}else {
			System.out.println(", TV: truned off");
		}
	}

}
