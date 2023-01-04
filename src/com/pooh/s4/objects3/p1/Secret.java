package com.pooh.s4.objects3.p1;

public class Secret {
//230104 1교시 접근지정자
	
	public int point = 500;
	public int money = 1000000000; //접근지정자 default가 생략된 경우. 같은 Package 내에서만 사용 가능하다
	
	//지정자가 default인 생성자 만들기
	public Secret() {
		
	}
	
	public void s1() {
		System.out.println("Secret의 s1 method 실행");
	}
	
	//defalut 지정자 = 같은 Package 내에서만 사용 가능
	void s2() {
		
		
	}
}
