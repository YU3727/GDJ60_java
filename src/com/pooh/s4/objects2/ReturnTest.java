package com.pooh.s4.objects2;

import java.util.Random;

public class ReturnTest {
//230103 2교시
	//만든 결과물을 되돌려 주는것이 return, 전달 받든 안받든 상관없다.
	public void t1() { //2-1.return 값이 없다
		System.out.println("return이 없을 때는 void");
	}
	
	public int t2() { //2-2.return값은 int
		Random random = new Random(); //random 클래스 안에 있는 객체를 만듬.
		System.out.println("retur은 int 타입");
		return random.nextInt(50); //0~50미만의 수 랜덤으로 리턴
	}
	
	public int [] t3() { //2-3.return값은 int []
		int [] ar = new int[3];
		Random random = new Random();
		System.out.println("return은 int배열 타입");
		for(int i=0; i<3; i++) {
			ar[i] = random.nextInt(10);
		}
		return ar;
	}
}
