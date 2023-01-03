package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {
//반복문, for문 로그인 성공, 실패 예제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int gId = 0;
		int gPw = 0;
		boolean check = false; //boolean의 초기값은 false로 약속
		
		//만들 때 단계별로 제대로 작동하는지 print문으로 확인해보자.(5회 반복이 제대로 된다 > 다음단계로...)
		//로그인 총 5회 시도 가능
		//반복은 종료 후, 로그인이 성공하면 "환영합니다", 실패하면 "은행을 방문하세요" 출력
		
		//논리정리 - 로그인 시도(5회까지) > 비교 > 성공하면 바로 환영합니다 출력하고, 실패하면 기회 5번까지.
		for(int i=0; i<5; i++) { //로그인 시도 5회
			System.out.println("ID 숫자 4자리를 입력해주세요");
			gId = sc.nextInt(); //입력받을 id
			System.out.println("PW 숫자 4자리를 입력해주세요");
			gPw = sc.nextInt(); //입력받을 pw
			
			if(gId == id && gPw == pw) { 
				//System.out.println("일치함"); //확인용
				check = true; //로그인 성공, check값에 true 넣기.
				i = i +5; //로그인 성공, for문 탈출하기.
			}else {
				//System.out.println("불일치함"); //확인용
				check = false; //로그인 실패, 증감문으로 돌아가서 조건 재비교
			}
		}
		
		if(check) {
			System.out.println("환영합니다"); //로그인 성공한 경우 check값이 true이므로 환영합니다 출력
		}else {
			System.out.println("은행을 방문하세요"); //로그인 최종 실패
		}
	}

}
