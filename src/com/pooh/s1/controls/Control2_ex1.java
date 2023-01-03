package com.pooh.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
//조건문, if else 예제, 로그인
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID와 PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로 부터 ID와 PW를 입력받아서 로그인 처리를 하려고 한다. 로그인 성공이냐 실패냐를 출력
		Scanner sc = new Scanner(System.in);
		
		int gId = 0;
		int gPw = 0;
		String log = " ";
		
		System.out.println("ID 숫자 4자리를 입력해주세요");
		gId = sc.nextInt();
		System.out.println("PW 숫자 4자리를 입력해주세요");
		gPw = sc.nextInt();
		
		if(id == gId && pw == gPw) {
			log = "로그인 성공";
		}else {
			log = "로그인 실패";
		}
		
		System.out.println(log);

	}

}
