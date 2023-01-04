package com.pooh.s4.objects5.characters;

public class Archer extends Character {
//230104 5교시 상속과 다형성

	private int dex;
	
	public Archer() {
		super();
	}
	
	@Override
	public void attack() {
		System.out.println("활쏘기");
	}
	
	public void move() {
		System.out.println("이동!");
	}

	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
}
