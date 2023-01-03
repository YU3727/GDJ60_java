package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {
//반복문, for문 예제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력 받고, 학생 수만큼 점수를 입력 받아서
		//총합계를 출력하면 된다.
		
//		int figure = 0; //학생 수를 담을 변수
//		int sum = 0; //점수합계를 담을 변수
//		
//		System.out.println("학생 수를 입력해 주세요");
//		figure = sc.nextInt();
//		
//		for(int i=0; i<figure; i++) {
//			int score = 0; //입력받을 점수
//			System.out.println("점수를 입력해 주세요");
//			score = sc.nextInt();
//			sum = sum + score;	//sum += score; 와 같음. 연산자 간단하게 하는거를 연습해보자.
//		}
//		System.out.println("총 점수는 : "+sum+"점입니다");
		
		
		//입력한 초 까지만 표기 되게끔. for문의 원리를 잘 생각해보고 풀기.
		System.out.println("초를 입력하세요");
		int sec = sc.nextInt();
		
//		for(int i=0; i<60; i++) { //초기조건증감식은 수정x
//			if(i-1 < sec) {
//				System.out.println(i+"초");
//			}
//		} //내가 푼 방법인데, 이건 for구문을 60회 그대로 반복하는거라 강사님이 원하는 의도는 아니였던거 같음.
		
		for(int i=0; i<60; i++) {
			System.out.println(i+"초");
			if(sec == i) {
				i = i + 60; // i값을 조건식의 범위에서 벗어나게 해서(false) for구문을 탈출시킨다.
			}
		}
		System.out.println("종료합니다");
	}
}
