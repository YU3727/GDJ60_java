package com.pooh.s4.objects3.p2;

import com.pooh.s4.objects3.p1.Secret;

public class SecretMain {
//230104 1교시 2교시 접근지정자
	public static void main(String[] args) {
		//패키지 단위로 분리하려고 하는 것
		//각각의 Package에 같은 이름의 class가 있는 경우의 객체 생성방법
		Secret secret = new Secret(); //기본적으로 Secret은 먼저 만든 p1 package에서 가져온 것.(import)
		
		//나중에 만든 p2 package의 Secret Class명을 쓰고싶으면 풀패키지명을 명시해야함.
		com.pooh.s4.objects3.p2.Secret secret2 = new com.pooh.s4.objects3.p2.Secret(); 

		
		secret.s1();
//		secret.s2(); < 다른패키지에 선언된 멤버메서드이므로 오류가 뜬다.
		
		//접근 지정자 때문에 오류 발생. secret에 있는 money 사용 불가
		System.out.println(secret.money);
		
		Test test = new Test();
		System.out.println(test.point);

	}

}
