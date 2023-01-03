package com.pooh.s4.objects2;

public class Car {
//230103 8교시, 생성자, 메서드 오버로딩
	
	//자동차의 설계도
	String company;
	String name;
	int price;
	String color;
	
	//default Constructor
	public Car() { //객체가 만들어질때 기본적으로 아래값이 들어간다.
		this("Black"); //생성자 내에서 다른 생성자를 호출.
//		this.company = "KIA";
//		this.name = "스포티지";
//		this.price = 3500;
//		this.color = "Black";
	}
	
	//메서드 오버로딩 - color 세팅
	public Car(String color) {
		this(color, 3500);
//		this.company = "KIA";
//		this.name = "스포티지";
//		this.price = 3500;
//		this.color = color; //출고될 때 부터 입력된 color로 출고
	}
	
	//메서드 오버로딩 - price, color 세팅
	public Car(String color, int price) {
		this(color, price, "스포티지");
//		this.company = "KIA";
//		this.name = "스포티지";
//		this.price = price;
//		this.color = color;
	}
	
	//메서드 오버로딩 - name, price, color 세팅
	public Car(String color, int price, String name) {
		this.company = "KIA";
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Name : "+this.name);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
		System.out.println("\n");
		
	}

}
