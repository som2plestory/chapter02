package com.javaex.ex05;

public class Song {
	
	//필드
	String title, artist, album, composer;
	int year, track;
	
	//생성자
	
	//메소드 - gs
	public void setterTitle(String main) {
		title = main;
	}
	
	public void setterArtist(String singwho) {
		artist = singwho;
	}
	
	public void setterAlbum(String book) {
		album = book;
	}
	
	public void setterComposer(String madeby) {
		composer = madeby;
	}
	
	public void setterYear(int when) {
		year = when;
	}
	
	public void setterTrack(int no) {
		track = no;
	}
	
	public String getterTitle() {
		return title;
	}
	
	public String getterArtist() {
		return artist;
	}
	
	public String getterAlbum() {
		return album;
	}
	
	public String getterComposer() {
		return composer;
	}
	
	public int getterYear() {
		return year;
	}
	
	public int getterTrack() {
		return track;
	}
 
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}

}
