package com.pooh.s4.objects2;

public class MonsterMain {
//230103. 6교시, 7교시
	public static void main(String[] args) {
		//몬스터 만들기
		Monster mon1 = new Monster(); //몬스터1
		mon1.power = 10;
		mon1.hp = 100;
		
		Monster mon2 = new Monster(); //몬스터2
		mon2.power = 10;
		mon2.hp = 100;
		
		//7-1.주소를 비교하고싶은게 아니라, 멤버변수의 값이 일치하면 같다고 표시하고 싶으면?
		mon1.checkValue(mon2); //객체(mon1)가 checkValue 메서드를 수행하는데 매개변수 값으로 mon2를 준다.
		
		System.out.println(mon1 == mon2); //얘는 stack영억 상의 mon1 주소값과 mon2 주소값의 비교
		System.out.println(mon1.checkValue(mon2));
		
		//메서드 호출
//		System.out.println(mon1); //mon1의 주소
//		mon1.info(); //mon1을 호출 > info 메서드 내에 this값이 출력. this : 생성된 객체의 주소값을 담은 참조변수
//		
//		System.out.println(mon2); //mon2의 주소
//		mon2.info(); //mon2를 호출 > info 메서드 내에 this값이 출력
		

	}

}
