package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
//반복문, for문 예제
	public static void main(String[] args) {
		//배그, 총알 30발 = 1탄창, 캐릭터당 3탄창을 줌. 
		//한번에 쏠 수 있는 양은 30발
		
		//a) 1. 단발, 2. 점사 선택지를 물어봄
		//b) 1번이면 "탕" 30번 반복출력, 2번이면 "타다당" 10번 반복 출력
		//c) 다 쓰고 나면 a로 돌아감. 탄창은 3개 있으므로 a~c를 3회 반복하면 프로그램 끝
		
		
		//생각 - 일단 단발점사 선택존(boolean flag 사용 - 안되겠다;)
		//1번 고르면 30번 출력, 2번 고르면 10번 출력
		//각각 30번/10번 다 쓰고나면 다시 단발점사 물어보는곳에 가야함.
		
		Scanner sc = new Scanner(System.in);
		int gunType = 0; // 단발, 점사 선택지
		
		
		for(int i=3; i>0; i--) {
		System.out.println("단발은 1번, 점사는 2번을 선택해주세요");
		gunType = sc.nextInt();
		//System.out.println(gunType); //확인용

		switch(gunType) { //switch는 break 안걸면 아래 코드 쭉 실행함.
		default : //이상한거 골랐을 때
			System.out.println("1, 2번중에 선택해주세요"); i++; break;
		case 1: //단발
			for(int j=29; j>=0; j--) {
				System.out.println("탕"+"\t 남은 탄약 수 :"+j+"/30");
			}
			break;
		case 2: //점사
			for(int j=27; j>=0; j=j-3) {
				System.out.println("타다당"+"\t 남은 탄약 수 :"+j+"/30");
			}
			break;
		}
		}
		
		System.out.println("탄창을 보충해주세요");
	}

}
