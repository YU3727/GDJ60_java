package com.pooh.s4.objects6;

public class Robot { //Robot 클래스는 Left, Right클래스에 대해 의존적이다. 없으면 일을 하지 않기 때문
//230105 2교시
	
	//다른클래스를 멤버변수로 만들고, 얘네들을 조립해서 클래스로 만들기
	private ArmLeft armLeft;
	private ArmRight armRight = new ArmRight(); //데이터를 집어넣음 = inject
	
	//기본생성자 만들어주기
	public Robot() {
		this.armRight = new ArmRight(); //여기서 오른팔을 끼워볼까?
	}
	
	//외부클래스에서 객체를 만들어서 넣어줌 = 약한결합
	public Robot(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	//private 변수를 사용하기 위해 getter/setter 메서드
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
	
}
