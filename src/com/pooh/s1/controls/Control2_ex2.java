package com.pooh.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {
//조건문, if else 예제, 합격불합격
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//초기화
		double kscore = 0.0; //국어점수
		double escore = 0.0; //영어점수
		double mscore = 0.0; //수학점수
		double total = 0.0;  //총점
		double avg = 0.0;    //평균
		
		
		System.out.println("국어 점수를 입력하세요"); //사용자가 해야할 일을 알려줘야 함. 사용자친화적으로
		kscore = sc.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		escore = sc.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		mscore = sc.nextDouble();
		
		total = kscore + escore + mscore;
		avg = total/3.0;
		String grade = " ";
		
		//평균이 60점 이상인가?
		//과목당 점수가 40점 미만이면 불합격
		//합격 불합격 출력
		
/*		if(avg >= 60 && kscore >= 40 && escore >= 40 && mscore >= 40 ) {
			grade = "합격입니다";
		}else {
			grade = "불합격입니다";
		}
/*		
/*		다른 방법1
		if(avg >= 60) {
			if(kscore >= 40 && escore >= 40 && mscore >= 40) {
				grade = "합격입니다";
			}else {
				grade = "불합격입니다";
			}
		}else {
			grade = "불합격입니다";
		}
*/		

//		다른 방법2
		boolean flag = false;
		if(avg>=60) {
			flag = true;
		}
		
		if(kscore < 40 || escore < 40 || mscore < 40) {
			flag = false;
		}else {
			flag = true;
		}
		
		if(flag) {
			grade = "합격입니다";
		}else {
			grade = "불합격입니다";
		}
		
		System.out.println("총합 점수 : "+total);
		System.out.println("평균 점수 : "+avg);
		System.out.println(grade);
	}

}
