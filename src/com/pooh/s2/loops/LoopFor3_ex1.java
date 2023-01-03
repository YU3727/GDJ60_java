package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {
//반복문, 다중for문 예제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력 받아서, 해당 분 초가 되면 반복문을 모두 종료하기
		System.out.println("분을 입력해주세요");
		int min = sc.nextInt();
		System.out.println("초를 입력해주세요");
		int sec = sc.nextInt();
		
		//생각 정리 - 분을 입력 받으면 해당 초 이후의 해당 분에서 멈춰야 한다
		//초를 입력 받으면 해당 분의 이전분까지는 60초까지 다 돌고 해당분이 되면 해당초에 멈춰야 함...
		for(int b=0; b<60; b++) { //크게 도는거 분
			
			for(int s=0; s<60; s++) { //작게 도는거 초
				System.out.println(b+" 분 "+s+" 초 ");
				if(min == b && sec == s) {
					break; //작게 도는 for만 종료되고, 바깥쪽 for는 계속 돌아간다.
				}
			}
			if(min==b) {
				break; //바깥쪽 for만 종료된다.
			}	
		}
		System.out.println("프로그램 종료");
	}

}
