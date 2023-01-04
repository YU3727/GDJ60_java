package com.pooh.s4.objects3.p1;

public class MemberMain {

	public static void main(String[] args) {
		
		//회원 하나를 새로 만든다 > 객체 하나 생성
		Member member = new Member();
		//setAge라는 메서드를 통해 private로 지정된 멤버변수에 값을 검증하고 넣을 수 있다.
		member.setAge(30);
		member.info();
		
		
//		member.name = "pooh";
		//age의 값이 적절한 범위인지 검사할 필요가 있다.
//		int age = 0;
//		if(age > 0 && age < 100) {
//			member.age = age;
//		} >> 이렇게도 가능하지만, 해가 바뀌면 또 수식을 만들고, 값을 입력해야한다.

	}

}
