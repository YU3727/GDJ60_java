package com.pooh.s3.array;

import java.util.Scanner;

public class Array6 {
//배열, 배열 수정하기2
	public static void main(String[] args) {
		int [] ar = {8, 5, 13, 9, 6};
		
		//키보드로 부터 삭제하고 싶은 값을 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("8, 5, 13, 9, 6");
		System.out.println("위 숫자로부터 삭제하고싶은 값 하나를 입력해주세요");
		int figure = sc.nextInt(); //없애고 싶은 숫자 받는것

		int [] mod = new int[ar.length-1]; // []안에 없애고싶은 값 1개씩 받으니까 1개씩 줄이는걸로
		//이러면 modify의 length는 ar의 length보다 1개 작은 값.
		int idx = 0;
		
		for(int i=0; i<ar.length; i++) { 
			
			if(ar[i]==figure) {
				continue; //밑의 코드를 무시하고 증감문으로 간다.
			}
			
			mod[idx] = ar[i];
			idx++; // idx를 1씩 증가시키기
			
		}
		
		ar = mod; //mod배열을 ar배열에 복사하기
		
		//출력하기
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		//내 생각은 6칸짜리 배열 2개 만들어서 복사 각각하고 선택된 수를 배열1의 마지막항에 넣고 
		//선택된 숫자로부터 왼칸으로 하나씩 미는걸로 생각을 했음.... 흠
		//처음부터 문제 해결이 어려우면 단계단계별로 써가면서 분석을 하는것이 중요하다
	}

}
