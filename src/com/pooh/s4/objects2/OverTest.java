package com.pooh.s4.objects2;

public class OverTest {
//230103 7교시
	//매개변수 두개를 받아서 + 한 결과를 리턴
	//같은 작업을 하는 수많은 메서드를 직접 만들어야 하는 불편함이 있다. 이를 보완해주는게 Method OverLoading
	//public void hap(int b, int a) { } // 이건 에러가 나온다. 매개변수타입과 갯수가 같기 때문. 
	
	public int hap(int a, int b) {
		return a+b;
	}
	
	public double hap(int a, double b) {
		return a+b;
	}
	
	public String hap(String a, int b) {
		return a+b;
	}
}
