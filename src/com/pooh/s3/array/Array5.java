package com.pooh.s3.array;

public class Array5 {
//배열, 배열 수정하기1
	public static void main(String[] args) {
		int [] ar1 = {1, 2, 3};
		//마지막 배열 값을 지우는 효과 만들기.
		//ar1을 반복문 돌렸을때 1, 2만 나오게 배열을 수정하기
		
		int [] copy = new int[ar1.length-1];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = ar1[i];
		}
		
		ar1 = copy;
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}
}
