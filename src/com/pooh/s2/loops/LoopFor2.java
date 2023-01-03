package com.pooh.s2.loops;

public class LoopFor2 {
//반복문의 보조문, for문에만 있는건 아니다.
	public static void main(String[] args) {
		//반복문의 보조문
		//1. break; : 반복문 내에서 break를 만나면 그 즉시 반복문을 종료한다.
		//조건식을 false로 만드는것과 보조문 break;를 사용하는 것으로 반복문을 종료시킬수 있다.
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i%4==3) {
				break;  //break 아래에 코드가 있으면 실행할 수 없기에 에러가 뜸
			}
		}
		System.out.println("반복문 종료");
		
		
		//2. continue;
		//for문 내에서 continue를 만나면 그 즉시 증감식으로 이동
		//while문 내에서 continue를 만나면 그 즉시 조건식으로 이동
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue; //continue 아래에 코드가 있으면 실행할 수 없기에 에러가 뜸
			}
			System.out.println(i);
		}
		System.out.println("반복문 종료");
		
		
	}

}
