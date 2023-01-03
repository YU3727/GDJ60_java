package com.pooh.s4.objects1.ex1;

import java.util.Scanner;

public class StudentView {
//메서드, 학생의 정보를 출력하는 부분
	
	//viewList 메서드 만들기
	//n명의 학생들을 받아서 학생의 모든 정보를 출력하기 -> 여러명이므로 하나의 변수에 여러데이터 넣기(배열)
	public void viewList(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println("Name : "+students[i].name);
			System.out.println("번호 : "+students[i].num);
			System.out.println("국어점수 : "+students[i].kscore);
			System.out.println("영어점수 : "+students[i].escore);
			System.out.println("수학점수 : "+students[i].mscore);
			System.out.println("총점 : "+students[i].total);
			System.out.println("평균 : "+students[i].avg);
			System.out.println("=======================");
		}	
	}
	
	//메서드 명은 viewOne
	//학생 한명의 정보를 받아서 학생의 모든 정보를 출력하는 메서드.
	//학생 한명을 호출 > viewOne에 데이터를 줌 > viewOne에서 학생의 데이터를 출력
	public void viewOne(Student student) { //이 메서드가 하는 일이 학생의 정보들을 출력.
		
		System.out.println("Name : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어점수 : "+student.kscore);
		System.out.println("영어점수 : "+student.escore);
		System.out.println("수학점수 : "+student.mscore);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+student.avg);
		System.out.println("=======================");
	}
}
