package com.pooh.s4.objects5.characters;

public class Main {
//230104 5교시 상속과 다형성
	public static void main(String[] args) {
		//magition과 archer에 공통적으로 있는 변수를 부모클래스 character에 만들고, 상속받음
		
		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);
		magition.setHp(0);
		
		Archer archer = new Archer();
		archer.setHp(0);
		
		magition.attack();
		archer.attack();
		
		
	}

}
