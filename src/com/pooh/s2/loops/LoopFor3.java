package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor3 {
//반복문, 다중for문
	public static void main(String[] args) {
		//구구단 3단
		// 3*1=3
		// 3*2=6 
		// 3*3=9...
		// 3*9=27 -> 변하지 않는 값 3(n단) / 변하는 값 1~9와 결과값
		
		//입력받은 단을 표기하기.
//		Scanner sc = new Scanner(System.in);
//		int dan = 0;
//		System.out.println("단을 입력하세요");
//		dan = sc.nextInt();
		
		//구구단
		for(int dan=2; dan<10; dan++) {
	
			for(int i=1; i<10; i++) {
			System.out.println(dan+" * "+i + " = "+dan*i);	
			}
		}
	}

}
