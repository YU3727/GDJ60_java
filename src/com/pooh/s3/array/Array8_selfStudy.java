package com.pooh.s3.array;

import java.util.Arrays;
import java.util.Collections;

public class Array8_selfStudy {
//배열, 오름차순, 내림차순 함수 사용하기
	public static void main(String[] args) {
		int [] ar = {5, 9, 8, 3, 6};
		//오름차순
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		System.out.println("\n================");
		
		//내림차순
		Integer [] arr = {5, 9, 8, 3, 6};
		Arrays.sort(arr,Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
