package com.pooh.s2.loops;

import java.util.Scanner;

public class LoopWhile2 {
//반복문, while
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true; //while문을 돌리기 위한 조건을 주기위해 boolean타입 변수를 만든다.
		
		while (check) {
			System.out.println("1. 짜장  2. 짬뽕  3. 탕수육  4. 프로그램종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("짜장을 선택했습니다");
				break;
			case 2:
				System.out.println("짬뽕을 선택했습니다");
				break;
			case 3:
				System.out.println("탕수육을 선택했습니다");
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				check = false; //위의 while문을 탈출하기 위에 check값을 false로 바꿔준다.
				break; //이때의 break는 switch의 break.
			}
			
		}
		System.out.println("시스템 종료");
	}

}
