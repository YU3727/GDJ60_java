package com.pooh.s4.objects1;

public class MethodTest3 {
//메서드, 매개변수 사용하기
	public void t3(int salary, double tax) { //매개변수 - 호출하는 쪽과 호출당하는 쪽 두가지 메서드 사이의 데이터값이 공유될 필요가 있을 경우 사용함.
		//실급여를 계산하는 메서드
		salary = (int)(salary*tax);
		System.out.println("T3 :"+salary);
		
	}
	
	public void info (Sword sword) { //데이터타입 Sword(클래스이름), 변수명 sword의 정보를 가져와라
		//Sword의 모든 정보를 출력하고 싶은 것
		//(매개변수로 String name,... int level)로 해도 된다.
		System.out.println(sword.name);
		System.out.println(sword.damage);
		sword.name = "단도";
	}
}
