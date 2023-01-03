package com.pooh.s4.objects1;

import java.util.Scanner;

public class ObjectsMain3 {
//Class와 Objects, 여러개의 객체 생성. 배열
	public static void main(String[] args) {
		//n명의 학생 객체 생성
		Scanner sc = new Scanner(System.in);
		//스캐너라는 데이터타입 sc 변수명 (선언)은 new scanner라는 객체를 생성하는 것.
		System.out.println("학생수를 입력");
		int count = sc.nextInt();
		//스캐너의 sc. 
		Student student = null;
		
		Student [] students = new Student[count]; //student들을 배열로.
		Student [] students2 = new Student[count];
		
		//student = new Student(); //이렇게 하면 student 하나의레퍼런스형에 자료만 3번 새로 대입해서 넣은 꼴
		for (int i = 0; i < students.length; i++) {
			student = new Student(); //이렇게 하면 student 레퍼런스형 자체를 3번 만드는 꼴
			System.out.println(i+1+" 번째 학생의 이름을 입력하세요");
			student.name = sc.next();
			students[i] = student; // students배열은 Student데이터 타입. student도 Student데이터 타입. 그래서 넣을 수 있음.	
			} 
		
		//System.out.println(student.name); //변수 하나에 데이터값 하나 밖에 못넣음. 여러개 넣고싶으면? >> 배열
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			System.out.println(students[i].name);
			//System.out.println(students2[i].name);
			}
		System.out.println("finish");
		
		//배열은 같은 데이터 타입을 넣을 수 있는데, Class도 데이터타입이라 생각하면 배열에 같은 Class를 넣을 수 있다.
		//Class도 데이터타입이라 생각하면 문제의 80%는 해결된다.....
	}

}
