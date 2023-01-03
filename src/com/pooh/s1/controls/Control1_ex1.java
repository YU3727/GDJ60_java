package com.pooh.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {
//조건문, 단일 if 예제, 평균에 따른 점수등급 산정
	public static void main(String[] args) {
		//키보드로 부터 국어, 영어, 수학 점수를 입력 받는다.
		//총점과 평균을 계산한다.
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그 외 나머지는 F를 출력
		
		Scanner sc = new Scanner(System.in);
		
		//초기화
		double kscore = 0.0; //국어점수
		double escore = 0.0; //영어점수
		double mscore = 0.0; //수학점수
		double total = 0.0;  //총점
		double avg = 0.0;    //평균
		//char ch = ' ';         char의 초기값은 ' '
		//boolean check = false; boolean의 초기값은 false
		
		System.out.println("국어 점수를 입력하세요"); //사용자가 해야할 일을 알려줘야 함. 사용자친화적으로
		kscore = sc.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		escore = sc.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		mscore = sc.nextDouble();
		
		total = kscore + escore + mscore;
		avg = total/3.0;
		String grade = " ";
		
		System.out.println("총합 점수 : "+total);
		System.out.println("평균 점수 : "+avg);
		
		grade = "F"; //시작값을 F로 시작하면 모든 조건에 맞지 않는 경우(70점 미만) F가 출력된다.
		
		if(avg>=90) {
			//System.out.println("A");
			grade = "A";
		}
		
		if(avg>=80 && avg<90) { //정확한 조건은 80점 이상 90점 미만, 미만조건이 없으면 90점 이상에서도 B가 출력됨
			//System.out.println("B");
			grade = "B";
		}
		
		if(avg>=70 && avg<80) { //정확한 조건은 70점 이상 80점 미만
			//System.out.println("C");
			grade = "C";
		}
		
/*		if(avg<70) {
			//System.out.println("F");
			grade = "F";
		}                       //마지막 조건문을 지웠을떄 F를 출력하려면 어떻게 해야 할까?
*/		//위와 같이 변수를 적절히 사용하면, 프로그램을 만드는데 필요한 코드량이 줄어든다.

		
		
		//출력문은 딱 한번만 사용
		System.out.println(grade);
		
	}
}
