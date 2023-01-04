package com.pooh.s4.objects4;

public class Card {
//230104 3교시 4교시 그외지정자 static - 클래스변수, 클래스메서드, 초기화블럭
	
	//Card - 하는일은 없고 정보만 담고 있으므로, DTO, VO라고 부름.
	private String shape; //다이아, 스페이드, 클로버, 하트
	private int number;   //1~k
	private String color; //빨강, 까망
	
	//클래스 변수(static변수)
	public static int size = 10;
	
	//클래스 메서드(static메서드) - 어쩌다 한번씩 사용하는거라 주의사항만 알아두자.
	public static void staticMethod() {
		Card.size = 10;
		System.out.println("Static Method");
//		System.out.println(this.shape);
//		this.info();
		Card card = new Card(); //객체를 만드는 것은 가능하다.(클래스는 있으니까)
		//shape과 info()라는 있을수도 있고 없을수도 있어서 없는걸 가정한다.
		//멤버변수와 멤버메서드는 객체를 생성하고나서 사용이 가능하다. 그러다 static은 객체생성 없이 사용가능..
		//즉, 클래스 메서드 내에서는 멤버변수나 멤버메서드를 사용할 수 없다.
		//멤버 메서드 내에서는 클래스변수나 클래스메서드를 사용할 수 있다.
	}
	
	//static 초기화 블럭
	static {
		Card.size = 50;
	}
	
	public void info() {
		System.out.println("Shape : "+this.shape);
		System.out.println("Color : "+this.color);
		System.out.println("Number : "+this.number);
		System.out.println("Size : "+Card.size);
		Card.staticMethod();
	}
	
	//setter/getter
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
}
