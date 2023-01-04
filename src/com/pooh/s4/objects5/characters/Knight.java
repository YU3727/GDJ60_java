package com.pooh.s4.objects5.characters;

public class Knight extends Character implements AttackAble {
//230104 8교시 다형성
	int str;
	
	Item item = new Sword();
	
	@Override
	public void attack() {
		item.a();
	}
}
