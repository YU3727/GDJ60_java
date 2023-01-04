package com.pooh.s4.objects5.characters;

public interface AttackAble {
//230104 7교시 인터페이스
	//또다른 추상클래스라고 생각. 그러나 추상클래스 그자체는 아님
	
	//상수
	public static final int DAMAGE = 1;
	
	
	
	//추상메서드
	//접근지정자 : 무조건 public
	//그외지정자 : 무조건 abstract
	public abstract void attack ();
//	abstract void attack2 (); //public 생략 가능
//	void attack3 (); //public abstract 생략 가능
	
	
	
}
