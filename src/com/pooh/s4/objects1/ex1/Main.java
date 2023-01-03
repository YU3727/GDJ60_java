package com.pooh.s4.objects1.ex1;

import java.util.Scanner;

public class Main {
//메서드, 메서드 만들고 호출하기
	public static void main(String[] args) {
		//메인 메서드 - 프로그램의 시작점 역할 또는 테스트 하는 역할 
		//기능분리를 해야한다. - 메인메서드는 실행하기만
		
		MenuController menuController = new MenuController(); //메뉴컨트롤러라는 메서드를 실행하기 위해 해당 메서드의 객체를 만들어 준다.
		
		
		//MenuController 작동
		menuController.start(); //멤버를 사용하기 위하여 참조변수명.메서드명() 으로 호출
		
		
		
			
			
//		//StudentInput의 setStudent 작동(미완)
//		int count = 0;
//		System.out.println("학생수 입력");
//		count = sc.nextInt();
//		Student [] students = new Student[count]; //student의 정보를 담을 배열 생성까지는 ok
//		Student student = new Student();
//		StudentInput si = new StudentInput(); //studentinput 메서드를 활용하기 위한 객체 생성
//		StudentView sv = new StudentView();
//		
//		//setStudent만 출력해보기(미완)
//		si.setStudent(student);
//		sv.viewOne(student);
//			  
//		System.out.println("Main Method 종료");
//		}
	}
}
