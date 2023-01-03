package com.pooh.s2.loops;

public class LoopFor1_ex1 {
//반복문, for문 예제
	public static void main(String[] args) {
		//0~100 미만 사이의 짝수만 출력
		for(int i=1; i<100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}	
		}
		System.out.println("=====answer1 finish=====");
		
		//같은 조건하에 if문 없이 짝수만 출력하기
		for(int i=2; i<100; i=i+2) {
			System.out.println(i);
		}
		System.out.println("=====answer2 finish=====");
		
		//0~100미만의 합계를 구하세요(0+1+2+...+99+100)
		int j = 0; //합계를 담을 변수 j를 메인 메서드에 선언해둔다.
		for(int i=0; i<100; i++) {
			j = j + i;
		}
		System.out.println(j); // 지역변수 i는 for문의 { } 바깥에서 사용할 수 없다.

	}

}
