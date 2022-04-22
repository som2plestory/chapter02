package com.javaex.ex05;

public class SongApp_1 {
	
	public static void main(String[] args) {
		
		Song 아이유_좋은날 = new Song();
		아이유_좋은날.setTitle("좋은날");
		아이유_좋은날.setArtist("아이유");
		아이유_좋은날.setAlbum("Real");
		아이유_좋은날.setComposer("이민수");
		아이유_좋은날.setYear(2010);
		아이유_좋은날.setTrack(3);
		
		
		Song 빅뱅_거짓말 = new Song();
		빅뱅_거짓말.setTitle("거짓말");
		빅뱅_거짓말.setArtist("BIGBANG");
		빅뱅_거짓말.setAlbum("Always");
		빅뱅_거짓말.setComposer("G-DRAGON");
		빅뱅_거짓말.setYear(2007);
		빅뱅_거짓말.setTrack(2);

		Song 버스커버스커_벚꽃엔딩 = new Song();
		버스커버스커_벚꽃엔딩.setTitle("벚꽃엔딩");
		버스커버스커_벚꽃엔딩.setArtist("버스커버스커");
		버스커버스커_벚꽃엔딩.setAlbum("버스커버스커1집");
		버스커버스커_벚꽃엔딩.setComposer("장범준");
		버스커버스커_벚꽃엔딩.setYear(2012);
		버스커버스커_벚꽃엔딩.setTrack(4);
		
		아이유_좋은날.showInfo();
		빅뱅_거짓말.showInfo();
		버스커버스커_벚꽃엔딩.showInfo();

	}

}
