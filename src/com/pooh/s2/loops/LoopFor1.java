package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor1 {
//반복문, for문
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문을 진행할 횟수를 입력하세요");
		
		int k = 0;
		int count = 0;
		count = sc.nextInt();

		for(; count>k; k++) { // 조건식을 꼭 상수로 맞출 필요는 없고 dataType만 맞추면 된다.
			System.out.println("Hello World!"); //count라는 변수나 count*2같은 연산식도 가능
			System.out.println("Good Bye");
			System.out.println(k);
		}

		
		
		
	
		
		
/*		
		for(int i=0; i<5; i=i+1) { //i=i+1은 같은 연산자로 i++(후행)이 있다.
			System.out.println("Hello World!");
			System.out.println("Good Bye");
			System.out.println(i); // 이 i 는 반복문의 { }를 벗어나면 사용할 수 없다. 지역변수로 선언됐기 때문
		}
		
		
		int j = 0;
		for( ; j<5; j++) {
			System.out.println("Hello World!");
			System.out.println("Good Bye");
		}
		System.out.println(j);
*/		
		
		System.out.println("Finish");
	}

}
