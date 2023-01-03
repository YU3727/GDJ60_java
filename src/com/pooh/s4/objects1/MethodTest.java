package com.pooh.s4.objects1;

public class MethodTest {
//메서드 생성
	//메서드 선언 공식
	//public static void main(String [] args) { }
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]) { } / 약속 - [ ]는 옵션. 필요하면 쓰고 필요없으면 안쓴다.
	
	//접근지정자 : 판단이 안되면 public으로 시작
	//그외지정자 : 생략(아직 안배움)
	//리턴타입 : 판단이 안되면 void(아직 안배움)
	//메서드명 : 작명 (규칙 - 첫글자는 소문자로 시작해야하며, 두단어 이상일 경우 두번째 단어의 첫글자를 대문자로)
	//매개변수 : 생략(아직 안배움)
	
	public void t1() { //소괄호 까지를 메서드의 header, 선언부라 부름
		//{ }중괄호 부분을 body, 내용이라 부름
		//제어문, 반복문 등등
		System.out.println("t1 메서드 실행");
		MethodTest2 mt2 = new MethodTest2(); 
		
		mt2.info(); // mt2 메서드 호출
		
		
		
		int num = 10;
		System.out.println("T1 Num :"+num);
		System.out.println("t1 메서드 종료");
	}
	
	
	//t2 메서드 선언
	public void t2() {
		System.out.println("t2 메서드 실행");
		int num = 20;
		System.out.println("T2 Num :"+num);
		System.out.println("t2 메서드 종료");
	}
}
