package com.pooh.s1.controls;

public class Control3 {
//조건문, if else if else if ... else
	public static void main(String[] args) {
		//다중 선택 if ~ else if ~ else if ... else
		
		int avg = 85;
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >=80) {
			System.out.println("B");
		}else if(avg >=70) {
			System.out.println("C");
		}else
			System.out.println("F");
	}

}
