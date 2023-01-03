package com.pooh.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
//메서드, 학생의 정보를 입력하는 부분
//230102
//230103. 2교시 3교시
	
	
	//2-1.findStudent
	//학생배열을 받아서
	//학생의 번호를 입력받아서 번호가 일치하는 학생을 리턴하기. 없으면 null을 리턴
	public Student findStudent(Student [] students) { //학생 배열을 매개변수로 받을 것.
		//1.학생 객체 만들기
		Student student = new Student();
		student = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력해주세요");
		//2.번호 입력 받기
		int num = sc.nextInt();	
		
		//3.일치하는 학생 찾고 리턴하기. 없으면 null
		for(int i=0; i<students.length; i++) {
			if(num == students[i].num) {
				//4.7개의 학생정보(이름 번호 ~ 평균)을 하나로 리턴하기
				student = students[i];
			}	
		}
		//5.student 리턴
		return student;
	}
	
	
	//setStudent 메서드 만들기
	//학생한명 객체를 !생성!해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균 계산 하기
	//요구 사항에 맞게끔 만들어야 한다.(지금은 강사님의 의도, 나중에는 프로그램을 요구하는 클라이언트)
	public Student [] setStudent (Student [] students) {
		//정보 입력만 받기
		//생성 하라는 이야기는 여기서 객체를 만들라는 이야기이다
		//+3교시 추가 미션 : 기존의 배열에 한명 추가하여 입력하기.
		Scanner sc = new Scanner(System.in);
		Student student = new Student(); //객체생성
		
		//배열 한칸 늘리기(학생 추가하기)
		Student [] mod = new Student[students.length+1];
		
		//데이터 입력받기
		System.out.println("학생의 이름을 입력해주세요");
		student.name = sc.next();
		System.out.println("학생의 번호를 입력해주세요");
		student.num = sc.nextInt();
		System.out.println("학생의 국어점수를 입력해주세요");
		student.kscore = sc.nextInt();
		System.out.println("학생의 영어점수를 입력해주세요");
		student.escore = sc.nextInt();
		System.out.println("학생의 수학점수를 입력해주세요");
		student.mscore = sc.nextInt();
		student.total = student.kscore + student.escore + student.mscore;
		student.avg = student.total/3.0;
	
		for(int i=0; i<students.length; i++) { //기존 배열정보는 그대로 넣고
				mod[i] = students[i];
		}
		
		mod[students.length]= student; //mod의 마지막 배열(students.length)에 student 값을 넣자.
		
		students = mod; //얕은 복사
		return students;
	}
	
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 !생성!해서 이름, 번호, 국어, 영어, 수학 입력, 총점, 평균 계산하기
	//학생 객체를 배열에 대입. <학생의 수만큼 배열크기를 만들어야한다.
	public void setAllStudent (Student [] students) { //1.매개변수로 학생배열을 받아서
		
		Scanner sc = new Scanner(System.in); //입력 받아야 하니까 스캐너 준비하고
		
		for(int i=0; i<students.length; i++) {
			
			Student student = new Student(); //2.배열의 수만큼 학생 객체를 생성해서 
			System.out.println("학생의 이름을 입력하세요");
			student.name = sc.next();
			System.out.println("번호를 입력하세요"); //3.정보를 입력한다
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요");
			student.kscore = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			student.escore = sc.nextInt();
			System.out.println("수학점수를 입력하세요");
			student.mscore = sc.nextInt();	
			student.total = student.kscore + student.escore + student.mscore;
			student.avg = student.total/3.0;
			
			students[i] = student; //4.학생 객체를 배열에 대입한다.
		}
	}
}
