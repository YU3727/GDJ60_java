package com.pooh.s1.controls;

public class Control2 {
//조건문, 둘 중의 하나 if else
	public static void main(String[] args) {
		//두개 중 하나를 선택하는 if ~ else 구문
		//
		
		int age = 20;
		if(age >= 20) {
			System.out.println("성년입니다");
			int count = 1;
		}else {
			System.out.println("미성년입니다");
			//System.out.println(count);  if 중괄호 내에 count가 선언되었으므로 에러가 생긴다.
		}
		
	}

}
