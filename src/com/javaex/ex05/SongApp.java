package com.javaex.ex05;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song 아이유_좋은날 = new Song();
		아이유_좋은날.setterTitle("좋은날");
		아이유_좋은날.setterArtist("아이유");
		아이유_좋은날.setterAlbum("Real");
		아이유_좋은날.setterComposer("이민수");
		아이유_좋은날.setterYear(2010);
		아이유_좋은날.setterTrack(3);
		
		
		Song 빅뱅_거짓말 = new Song();
		빅뱅_거짓말.setterTitle("거짓말");
		빅뱅_거짓말.setterArtist("BIGBANG");
		빅뱅_거짓말.setterAlbum("Always");
		빅뱅_거짓말.setterComposer("G-DRAGON");
		빅뱅_거짓말.setterYear(2007);
		빅뱅_거짓말.setterTrack(2);

		Song 버스커버스커_벚꽃엔딩 = new Song();
		버스커버스커_벚꽃엔딩.setterTitle("벚꽃엔딩");
		버스커버스커_벚꽃엔딩.setterArtist("버스커버스커");
		버스커버스커_벚꽃엔딩.setterAlbum("버스커버스커1집");
		버스커버스커_벚꽃엔딩.setterComposer("장범준");
		버스커버스커_벚꽃엔딩.setterYear(2012);
		버스커버스커_벚꽃엔딩.setterTrack(4);
		
		아이유_좋은날.showInfo();
		빅뱅_거짓말.showInfo();
		버스커버스커_벚꽃엔딩.showInfo();

	}

}
