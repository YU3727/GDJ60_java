package com.pooh.s2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile1 {
//반복문, while, 숫자 맞출때 까지 반복하기
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int num = random.nextInt(15); // 0~15 미만의 정수를 num에 저장.
		
		while(check) { //반복문을 몇번 돌릴지 모르겠다면 반복문 while을 사용해야한다.
			System.out.println("숫자를 입력해주세요(0~14)");
			int a = sc.nextInt();
			if (a == num) {
				System.out.println("번호가 일치합니다");
				check = false; //또는 break; 조건식을 false로 만들거나 break를 하여 반복문을 벗어나야함.
			}else {
				System.out.println("번호가 다릅니다");
			}
		}
	}
}
