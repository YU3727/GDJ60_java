package com.pooh.s3.array;

public class Array3 {
//배열, 얕은 복사
	public static void main(String[] args) {
		int num = 1; //primitive type, 지역변수
		String name = "iu"; //reference type, 지역변수(단, 많이 사용하는 것이라 primitive type처럼 사용하게끔 자바 개발자들이 만들어 둠)
		int [] ar1 = {1, 2, 3}; //reference type, 지역변수
		int [] ar2 = {5, 6, 7, 8};
		
		ar1 = ar2; //ar1은 int배열 타입, ar2도 int배열 타입이라 가능
//		ar1 = num; //ar1은 int배열 타입, num은 int타입이라 불가능
//		ar1[0] = num; //ar1[0]는 int 타입, num은 int타입이라 가능
		
		//얕은 복사
		ar1 = ar2; //ar2의 주소값을 ar1에 집어넣음.
		ar2 = ar1;
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		
		System.out.println("------------------------------");
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println("------------------------------");
		for(int i=0; i<ar2.length; i++) {
			System.out.println(ar2[i]);
		}
	}

}
