package com.pooh.s1.controls;

public class Control4 {
//조건문, switch case
	public static void main(String[] args) {
		//다중 선택
		//switch case
		int num = 5;
		System.out.println("1. 햄버거");
		System.out.println("2. 샌드위치");
		System.out.println("3. 샐러드");
		
		switch(num) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:		
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("그 외 나머지");
			break;
		} //의도적이지 않는 경우, case 밑에 break를 꼭 걸어줘야 한다. case는 실행되고나서 break를 만나거나, switch case의 끝(중괄호 끝)까지 실행되기 때문.

	}
}
