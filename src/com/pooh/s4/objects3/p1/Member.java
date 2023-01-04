package com.pooh.s4.objects3.p1;

public class Member {
//230104 2교시 getter/setter
	//비만관리회사 회원등록
	//지정자 private - 내가 만든 변수에 이상한 값이 아닌 적절한 값이 들어갈 수 있도록 보호하는 역할도 가능
	//은닉성 : 내가 만든 변수를 외부로 유출하지 않는다.(dot 연산 해도 나오지 않으니)
	//앞으로 멤버변수를 만들때는 접근지정자를 private로 만들고, 데이터를 받는건 넣는메서드, 빼는메서드로 두개의 메서드를 만들어야함.
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	//기본생성자
	public Member() {
	}
	
	//생성자 오버로딩으로 age값을 검사하기 - 멤버를 생성할때만 적용가능....
//	public Member(int age) {
//		if(age > 0 || age < 100) {
//			this.age = age;
//		}
//	}
	
	
	//setter / getter 메서드
	//명명법 - 뭔가를 집어넣는다 : set~ // 뭔가를 가져온다 : get~
	
	//setter 메서드
	//명명법 : set + 멤버변수의 첫글자를 대문자로 바꾼 것
	//setter : 매개변수로 받은 값을 (적절한 검증 후) 자기자신의 변수에 대입함
	public void setAge(int age) { 
		if(age > 0 && age < 100) {
		this.age = age; //멤버메서드 this.age는 private로 지정되어있어도 같은 class내라서 접근 가능
		}
	}
	
	//getter 메서드
	//명명법 : get + 멤버변수의 첫글자를 대문자로 바꾼것
	//getter : 자기자신의 변수값을 return 시켜줌
	public int getAge() { 
		return this.age;
	}
		
	//Source를 통해 만들어진 getter/setter 메서드
	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
}
