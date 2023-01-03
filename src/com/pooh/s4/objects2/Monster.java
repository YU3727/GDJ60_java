package com.pooh.s4.objects2;

public class Monster {
//230103. 6교시
	//멤버변수(instance변수)는 클래스의 표면을 보여주는 것들
	int hp; //이 hp는 멤버변수(heap영역에 생성)
	int power;
	
	//멤버메서드(instance메서드)는 몬스터의 act를 나타낸다.
	
	public boolean checkValue(Monster monster) { //매개변수에는 비교하고싶은 대상을 대입
		//몬스터끼리 비교해서 몬스터의 스펙(hp, power)이 같으면 true값, 하나라도 다르면 false값 return 하는 메서드 만들기
		boolean check = false;
		if(this.hp == monster.hp && this.power == monster.power) {
			check = true;
		}
		return check;
	}
	
	
	//공격
	//어슬렁
	public void info() {
		//참조변수 this : class내에서만 사용 가능, 자기자신의 객체주소를 담음
		System.out.println(this);
		//이런식으로 자기 자신의 값을 가져다 쓸 수 있음. 그리고 !생략이 가능하다!
		System.out.println(hp); //=(this.hp);
		
		this.attack(); //this는 생략이 가능하므로 attack();도 가능
	}
	
	public void attack () {
		System.out.println("공격합니다");
		this.info(); //이 코드가 있으면 info와 attack가 서로 호출하면서 무한반복이 된다.
	}
	
	public void setHp(int hp) { //int hp는 매개변수이면서 지역변수(stack 영역에 생성)
		this.hp = hp; //멤버변수 hp에 매개변수 hp를 대입하기를 희망함. but this를 생략하면 매개변수 hp에 매개변수 hp를 넣음. 
		              //지역변수가 우선순위에 있기 때문에 이런 경우에는 this를 생략하면 안된다.
	}
}
