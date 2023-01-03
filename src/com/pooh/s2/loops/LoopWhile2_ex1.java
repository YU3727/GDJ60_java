package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {
//반복문 while, 게임 만들기 예제
	public static void main(String[] args) {
		//게임
		
		//로그인 파트 - 시도 횟수는 무제한
		//1. 로그인   2. 종료
		//1 : ID/PW 입력 후 로그인 판단.(맞으면 로그인, 틀리면 다시 로그인/종료 선택창)
		//2 : 프로그램 종료
		
		//게임진행 파트
		//1. 로그인 성공 했을때만 진행 가능
		//레벨은 1로 시작, 초기 gold는 0, 모든 몬스터의 경험치는 동일함(레벨업에 필요한 몬스터 마리수는 같음)
		//lv.5 달성시 1000gold, lv.10 달성시 2000gold, lv.15 달성시 3000gold 지급 + 메시지 출력
		//lv.1 > 2 필요 몬스터 수 3 // lv.2 > 3 필요 몬스터 수 6 // lv.3 > 4 필요 몬스터 수 9...lv15 되면 끝(52마리)
		//몬스터 잡을 때 마다 몬스터 사냥 성공 메시지 출력, 레벨업 할 때 마다 축하 메시지 출력, lv.15 달성시 끝
		//lv.15 달성시 최종 gold 소지량을 출력해주기.
		
		Scanner sc = new Scanner(System.in);
		int choice = 0; //로그인 파트 로그인 할거냐 말거냐
		int id = 1234; 
		int pw = 5678;
		int gId = 0;
		int gPw = 0;
		boolean check = true; //로그인 반복문 while에서 사용할 것
		boolean logIn = false; //로그인 성공 후 게임진행 파트 while에서 사용할 것
		
		//로그인 파트
		while (check) {
			System.out.println("1.로그인 / 2.종료");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("ID 숫자 4자리를 입력해주세요");
				gId = sc.nextInt();
				System.out.println("PW 숫자 4자리를 입력해주세요");
				gPw = sc.nextInt();
			
				if(gId == id && gPw == pw) {
					System.out.println("로그인 성공");
					logIn = true;
					check = false;
					break;
				}else {
					System.out.println("ID/PW를 확인해주세요\n");
					break;
				}
			case 2:
				System.out.println("게임을 종료합니다");
				logIn = false;
				check = false;
			}
		}
		
		//게임진행 파트
		//로그인 한거(logIn) 체크 먼저 하고, 레벨변수 1로 초기값.
		int lv = 1; //레벨 1로 시작
		int maxLv = 15; //레벨최대치 15
		int gold = 0; //골드 0으로 시작
		int exp = 0; //경험치 0으로 시작
		int monsterExp = 1; //몬스터 경험치 1
		int essentialExp = 3;
		
		if(logIn) {
			System.out.println("게임 스타트");
		}
		
		//내가 푼 방법
		while (logIn) {

			if(lv < maxLv) {
				exp = exp + monsterExp;
				//System.out.println(exp); //잡은 몬스터 수 확인용
				if(exp >= essentialExp) { //레벨업 할때 바뀌어야 하는 것들
					lv = lv + 1;
					essentialExp = lv*3;
					System.out.println("사냥한 몬스터 수 : "+exp);
					exp = 0;
					System.out.println("레벨 업! 현재 레벨은"+lv+"입니다");
				}
				
				if(lv%5 == 0 && exp == 0) { //아래 형태가 같은 if문 3개를 하나로 만듦.
					gold = gold + lv/5*1000;
					System.out.println("lv."+lv+"달성 보상 "+gold+"gold 지급");
				}
				
//				if(lv == 5 && exp == 0) {
//					gold = gold + 1000;
//					System.out.println("lv.5 달성 보상 1000gold 지급");
//				}
//				if(lv == 10 && exp == 0) {
//					gold = gold + 2000;
//					System.out.println("lv.10 달성 보상 2000gold 지급");
//				}
//				if(lv == 15 && exp == 0) {
//					gold = gold + 3000;
//					System.out.println("lv.15 달성 보상 3000gold 지급");
//				}
				
			}else {
				System.out.println("최종 15레벨 달성 축하합니다.");
				System.out.println("현재 gold 소지량은 : "+gold+"입니다");
				break;
			}	
		}
		
		
		//강사님 방법
		if(logIn) {
			
			int level = 1;
			int gold1 = 0;
			
			for( ; level<15; level++) {
				System.out.println("현재 레벨 : "+level);
				
				if(level%5==0) { //5의 배수
					System.out.println(level + "레벨 달성 축하금");
					gold1 = gold1 + level/5*1000; //아래 형태가 비슷한 if문 2개를 하나의 식으로 만듬.
				}		
				
//				if(level==5) {
//					System.out.println("5레벨 달성 축하금");
//					gold1 = gold1 + 1000;
//				}
//				if(level==10) {
//					System.out.println("10레벨 달성 축하금");
//					gold1 = gold1 + 2000;
//				}
				
				for(int m=0; m<level*3; m++) {
					System.out.println(m+1+" 마리 사냥 성공");	
				}
				
				System.out.println("축 레벨업");
			} //바깥쪽 for
			
			System.out.println("15레벨 달성 축하");
			gold1 = gold1 + 3000;
			System.out.println("Gold : "+gold1);
			
			
			
			
			
			
			
		}
		
		
	}

}
