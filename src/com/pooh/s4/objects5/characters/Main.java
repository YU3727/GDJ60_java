package com.pooh.s4.objects5.characters;

public class Main {
//230104 5교시 상속과 8교시 다형성
	public static void main(String[] args) {
		
//		//5교시 상속
//		//magition과 archer에 공통적으로 있는 변수를 부모클래스 character에 만들고, 상속받음
//		
//		Magition magition = new Magition();
//		magition.getMp();
//		magition.setMp(0);
//		magition.setHp(0);
//		
//		Archer archer = new Archer();
//		archer.setHp(0);
//		
//		magition.attack();
//		archer.attack();
//		
//		//Character가 추상클래스기 때문에 변수지정은 가능하지만 객체생성은 불가능하다.
//		Character character = new Character();
		
		//8교시 다형성
		Archer archer = new Archer();
		
		Character character = null;
		
		character = archer;
		archer = (Archer)character; //character중에서 Archer타입으로 polymoph해서 넣자.
		//Archer 클래스는 Character 클래스를 상속 받은 상태.
		//archer는 데이터 타입이 Archer, Character 두가지이다.
	
		
	}

}
