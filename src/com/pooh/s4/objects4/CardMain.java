package com.pooh.s4.objects4;

public class CardMain {
//230104 3교시 그외지정자static
	public static void main(String[] args) {
		
		//그외지정자 static을 통해 만든 변수
		//클래스명.변수명
		System.out.println(Card.size); //Card 클래스 영역에 있는 size라는 변수
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		
		Card.size = 8; //모든 카드의 size가 8이 됨
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		
		card.info();
		card2.info();
		
		
		

	}

}
