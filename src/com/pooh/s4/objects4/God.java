package com.pooh.s4.objects4;

public class God {
//230104 4교시 static - 클래스변수, 클래스메서드
	private String name;
	
	private static God god;
	
	private God() {}
	
	//객체를 만들어서 주는 메서드
	//static을 붙이면 클래스메서드가 되어 객체 생성을 하지않고 메서드를 사용가능해진다.
	public static God getInstance(God god) {
		//객체를 하나만 만들고 싶을 때
		if(god == null) {
			God god = new God();
		}
		return God.god;
		
		//객체를 메서드가 호출될 때마다 만들 때
//		God god = new God();
//		return god; //new God();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
