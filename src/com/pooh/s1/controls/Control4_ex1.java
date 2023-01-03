package com.pooh.s1.controls;

import java.util.Scanner;

public class Control4_ex1 {
//조건문, switch case 예제, 평균에 따라 성적등급 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균점수를 입력하세요");
		int avg = sc.nextInt();
		
		//평균이 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그 외에는 F
		//switch case를 사용해서 코드작성하기
		
		avg = (int)(avg/10);
		
		switch(avg) {
		case 10 : //print문의 반복작성을 피하기 위해 break를 의도적으로 뺀 경우.
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
			break;
		}
		//점수의 범위를 어떻게 하면 하나의 숫자로 바꿔서 계산할 수 있을까 생각해보자
		//100을 10으로 나누면 10, 99~90을 10으로 나누면 정수범위는 9, 89~80을 나누면 정수범위는 8 이런식으로 범위를 바꾸면 switch case를 쓸 수 있다.

	}

}
