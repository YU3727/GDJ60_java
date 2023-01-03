package com.pooh.s4.objects2;

public class Main {
//230103. 2교시
	public static void main(String[] args) {
		//2-1.Main에서 ReturnTest의 t1, t2를 호출해보자
		ReturnTest returnTest = new ReturnTest();
		
		returnTest.t1(); //return값이 void라는 것은 호출만 하라는 의미
		
		returnTest.t2(); //이 명령의 의미는 (홀>주방에)짜장면주세요~ 라는 요청같은 의미. 주방에서 짜장면을 요리해서 내놨는데 홀에서 가져가지 않는 형태.
		
		//이걸 제대로 쓰려면 
		int num = returnTest.t2();
		System.out.println(num);
		
		int [] ar = returnTest.t3();
		for(int i=0; i<3; i++) {
			System.out.println(ar[i]);
		}
		//git-Hub 업로드 확인용 주석 추가
	}

}
