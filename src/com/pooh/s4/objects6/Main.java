package com.pooh.s4.objects6;

public class Main {
//230105 2교시 이제껏 배운거 종합?같은 느낌
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//new ~ : heap 영역에 데이터 저장
		//로봇 객체 생성(생성자 호출)
		Robot robot = new Robot(); //생성자 호출시 armRight를 만듦
		System.out.println(robot.getArmLeft()); //너 왼팔 있니? > null 없으니까 왼팔을 만들자.
		//왼쪽팔 생성 - 항상 멤버변수를 사용하기 전에 객체를 만들어라.
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		System.out.println(robot.getArmLeft()); //팔 생겼다!
		
		//Robot 클래스의 기본생성자에 오른팔을 넣으라고 했으니까 한번 테스트 해보자
		System.out.println("ArmRight : "+robot.getArmRight());
		
		
		
		
		//객체를 지움 > 참조변수를 끊는다.
		robot = null; //robot에는 heap영역에 만들어둔 로봇의 데이터를 담은 주소값을 없앰.
		
		//데이터를 넣을때 내부에서 직접 객체를 만들어서 넣느냐, 외부에서 만든 객체를 넣어주느냐?
		//armLeft : 
		//armRight : 기본생성자에서 만들기 때문에, setter메서드를 사용하지 않아도 된다.
		//그래서 setter를 지웠는데, 팔을 바꿔야 하는경우가 생기면 setter가 없기 때문에 불가능함.
		
		//armRight는 참조변수가 끊어지면 지워지므로, robot과 armRight는 생명주기가 같음 = 강한연결
		//armLeft는 연결은 되어있지만, robot과 armLeft는 생명주기가 다름 = 약한연결
		
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
