package com.pooh.s3.array;

import java.util.Scanner;

public class Array2 {
//배열, 입력받고 출력하기.
	public static void main(String[] args) {
		int [] ar = new int[3]; //int의 배열을 ar이라는 변수명으로 만들 거다. heap영역에 int3개를 모은다.
		//int [] ar2 = new int []; //처음에 만들 때 몇개를 만들건지 반드시 명시해야한다. 비우면 오류뜸
		int [] ar2 = new int [2];
		
		//키보드로부터 숫자를 입력받아서 해당 숫자만큼 배열을 생성한다.
		//배열에 값을 키보드로 입력받고, 출력도 시켜줌
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 몇칸을 만들겠습니까?");
		int count = sc.nextInt();
		int [] ar3 = new int[count];
		
		for(int i=0; i<count; i++) { //입력부, 배열생성
			System.out.println(i+1+"번째 숫자 입력");
			ar3[i] = sc.nextInt();
		}
		
		for(int i=0; i<count ; i++) {
			System.out.println(ar3[i]); //출력부
		}

		System.out.println(ar[4]); //코드상 에러는 없지만 실행시 오류가 발생하면 exception(예외)라고 생각.
//		이런 exception을 피하기 위해 '배열명.length'를 쓰자.
//		for(int i=0; i<ar3.length; i++) { //입력부, 배열생성
//			System.out.println(i+1+"번째 숫자 입력");
//			ar3[i] = sc.nextInt();
//		}

	}

}
