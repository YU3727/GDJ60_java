package com.pooh.s4.objects2;

public class OverTestMain {
//230103. 7교시
	public static void main(String[] args) {
		
		//Method OverLoading
		OverTest ot = new OverTest(); //OverTest 객체 생성
		
		ot.hap("a", 0); //이렇게 해두면 hap 메서드 중에서 매개변수 string과 int의 합을 알아서 찾아서 작업을 수행한다.
		
	}

}
