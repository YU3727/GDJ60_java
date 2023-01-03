package com.pooh.s1.controls;

public class Control1 {
//조건문, 단일 if
	public static void main(String[] args) {
		//단일 if
		//if(조건식) {조건식이 true일 때 실행할 내용}
		//졸업시험, 무조건 졸업, 평규닝 90점 이상이면 우등상 수상
		//나중에 '~라면, ~이면' 등의 단어가 보이면 조건식을 써야한다 생각하자.
		System.out.println("프로그램 시작"); //start
		double avg = 90.12; // true, false가 나오는 값이면 조건문에 쓸 수 있음. ex) >, <
		boolean check = true;
		int scholarship = 0;
		
		
		if(avg >= 90) {
			System.out.println("우등상 수상");
			//int scholarship = 10000000;
			System.out.println("장학금 : "+scholarship);
			System.out.println(check);
			scholarship = 10000000;
		}
		
		System.out.println("장학금 : "+scholarship); //변수 scholarship이 if문의 중괄호 안에서 선언된 경우 if문의 중괄호가 끝나는 시점에서 변수 scholarship은 삭제되어 그 밖의 영역에서는 사용할 수 없다.
		System.out.println("졸업을 축하 합니다");
		System.out.println("프로그램 종료"); //finish
	}

}
