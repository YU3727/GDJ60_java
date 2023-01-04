package com.pooh.s4.objects5.characters;

public abstract class Character { //미완성 클래스 이므로, 상속해서 내용을 완성해라
//230104 5교시 상속 부모클래스 6교시 오버라이딩
	
	//archer과 magition의 공통적인 부분인 name과 hp를 부모클래스에 만든다
	private String name;
	private int hp;
	private int level;
	
	//기본 생성자
	public Character () {}
	
	//이 생성자만 있으면 매개변수가 없는 기본생성자가 자동으로 만들어지지 않는다.
	//그래서 프로그래밍을 배울때는 default Constructor를 쓰지않아도 만들어주는게 좋다.
	public Character (String name) {
		
	}
	
	//6교시 오버라이딩
//	public void attack() {};
//	public abstract void attack(); // 미완성된 메서드를 포함하면 클래스에도 abstract을 넣어준다.

	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
