package com.pooh.s4.objects5.characters;

public abstract class Magition extends Character {
//230104 5교시 상속과
//	private String name;
//	private int hp;
	private int mp;
	
	
	//오버라이딩 - 부모로 부터 받은메서드를 자신에 맞게 내용을 재정의 하기
	//선언부까지는 그대로 쓰고(접근지정자만 제한적으로 수정가능)
//	public void attack() {
//		System.out.println("마법 공격");
//	}
	
	public abstract void spell();
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
}
