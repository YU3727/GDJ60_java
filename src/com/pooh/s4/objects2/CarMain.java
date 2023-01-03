package com.pooh.s4.objects2;

import java.util.Scanner;

public class CarMain {
//230103 8교시
	public static void main(String[] args) {
		//생성자와 메서드오버로딩을 이용해서 초기값을 다르게 출력
		
		Car c1 = new Car();
		c1.info();
		
		Car c2 = new Car("Red");
		c2.info();
		
		Car c3 = new Car("Pink", 2000);
		c3.info();
		
		Car c4 = new Car("Blue", 5000, "K9");
		c4.info();
	}

}
