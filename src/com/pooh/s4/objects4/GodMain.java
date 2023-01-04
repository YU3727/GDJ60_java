package com.pooh.s4.objects4;

public class GodMain {
//230104 4교시 static - 클래스변수 클래스메서드, SingleTon 디자인패턴
	public static void main(String[] args) {
		
		//SingleTon 디자인패턴
		//전체 프로그램에서 객체를 딱 한개 만들게끔 유도하는 패턴
		
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
		god = god.getInstance();
		
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
	}
}
