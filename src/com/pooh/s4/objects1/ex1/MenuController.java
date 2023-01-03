package com.pooh.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
//230103. 1교시, 2교시
	//start라는 메서드
	//하는일 : start라는 메서드가 호출되면 메시지 호출
	//1. 등록, 2. 수정, 3. 삭제, 4. 종료
	
	//생각 정리 - 4 누를때까진 프로그램이 돌아야함. while 쓰고
	//내부에 if나 switch case로 1~4 선택지 주고
	//나머지는 메시지 출력만 하면 됨
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int select = 0;
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt(); //학생수 입력받기
		
		//setAllStudent를 사용하기 위해 StudentInput클래스의 객체를 생성
		StudentInput si = new StudentInput(); //while문 안에 만들면 객체를 계속만드니까 바깥으로 빼준다.
		
		//viewList를 사용하기 위해 StudentView클래스의 객체를 생성
		StudentView sv = new StudentView();
		
		//학생 수만큼 미리 학생을 입력받을 수 있는 배열을 준비함
		Student [] students = new Student[count]; //student를 모을 배열을 선언한것, student를 만든것은 아니다
		
		while(check) {
			System.out.println("작업을 선택해주세요");
			System.out.println("1.학생 정보 입력 2.일치하는 학생 정보만 출력 3.모든 학생의 정보 출력 4.학생 한명 늘리기 5.종료");
			select = sc.nextInt();
			
			switch(select) {
			default:
				System.out.println("1~4번중에 선택해주세요");
				break;
			case 1:
				System.out.println("학생 정보를 등록합니다"); 
				//1번 누르면 StudentInput에 있는 setAllStudent가 호출되면 된다.
				si.setAllStudent(students);
				break;
			case 2:
				System.out.println("일치하는 학생의 정보를 출력합니다");
				//학생 한명의 정보를 받을 수 있는 student타입의 변수 student를 준비함.
				Student student = new Student();
				//2번 누르면 StudentInput에 있는 findStudent를 호출.
				//findStudent를 통해 입력된 값을 viewOne을 통해 학생 한명을 출력해줌
				student = si.findStudent(students);
				sv.view(student);
				break;
				
				//강사님 방법
//				Student student = si.findStudent(students);
//				if(student != null) {
//					sv.viewOne(student);
//				}
			case 3:
				System.out.println("모든 학생의 정보를 출력합니다");
				//3번 누르면 StudentInput을 통해 저장한 정보를 StudentView를 통해 출력한다.
				sv.view(students); //어떤 정보를 찍어야 하는지 최소한의 정보를 보내주는게 ()안의 역할
				break;
			case 4:
				System.out.println("학생 한명을 추가합니다");
				//4번을 누르면 StudnetInput을 통해 저장된 정보에 setStudent로 데이터 하나 추가.
				students = si.setStudent(students); //기존의 배열을 setStudent 메서드에 보내주고 
				break;                              //받아온 리턴값을 students에 덮어씌운다.
			case 5:
				System.out.println("프로그램을 종료합니다");
				check = false;
				break;
			}
		}	
	}
}
