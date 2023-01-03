package com.pooh.s4.objects1;

public class ObjectsMain2 {
//Class와 Object, 멤버변수 선언을 통해 객체를 생성하기.
	public static void main(String[] args) {
		
		//객체 생성(Sword의 Instance를 생성)
		Sword s1 = new Sword(); //칼 하나를 만든 것.
		s1.name = "집행검";       //'칼의'이름 이라고 생각.
		s1.damage = 50;
		s1.life = 200;
		s1.price = 50000;
		s1.level = 3;
		//s1의 data type에 따른 분류 : reference type, 변수가 선언된 위치에 따른 분류 : 지역변수(Stack영역), 주소를 담고있는 참조변수
		//지역변수는 영역이 실행되면 생성되고, 영역이 종료되면 삭제된다. 지역변수는 사용하기 전에 초기화를 해야한다.
		
		//name, damage, life.. 등은 heap영역에 만들어지므로, 지역변수가 아닌 '멤버변수', '인스턴스변수'이다.
		
		//객체 생성(Knight의 Instance를 생성)
		Knight knight = new Knight(); //기사 하나를 만든 것.
		knight.name = "Pooh";
		knight.hp = 1000;
		knight.str = 100;
		knight.dex = 50;
		knight.wis = 70;
		knight.con = 100;
		
		knight.sword = s1; //k1의 sword는 Sword타입 데이터기 때문에 s1을 집어넣을 수 있다.
		
		System.out.println(knight.sword.name); // Knight가 가지고 있는 칼의 이름을 출력하려면?
		
		
		//변수 선언
		Sword s2 = null; //reference type의 초기값은 모두 null이다.
		//s2는 지역변수이면서, 주소를 담고있는 잠조변수이다. 그러나 초기화를 하지 않아 쓸수 없다.
		System.out.println(s2.damage);
		

	}

}
