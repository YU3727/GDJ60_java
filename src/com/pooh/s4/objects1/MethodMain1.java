package com.pooh.s4.objects1;

public class MethodMain1 {
//멤버메서드, 매개변수, 인자값
	public static void main(String[] args) {
		//객체를 만드는것으로 시작
		System.out.println("Main Method 실행");
		//mt1, mt2
		//MethodTest mt = new MethodTest();
		
		//메서드를 호출하는 방법 - 호출순서 무관, 필요한만큼 호출
		//mt.t2(); //t2 메서드 호출
		//mt.t1(); //t1 메서드 호출 (참조변수명.메서드명())
		//메서드도 Stack 구조
		//main 메서드 실행 > t2 메서드 실행(main 일시정지) > t2 메서드 종료, 호출된 메서드(main)으로 되돌아감 > t1 메서드 실행(main 일시정지)
		
		
		//mt3
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		int salary = 3000000;
		//호출시 매개변수로 보내는 값 : 인자값 / 호출할때는 선언이 아니라 인자값을 보내야 한다....
		mt3.t3(salary, 0.97);
		
		System.out.println("main :"+salary); //메인메서드에서는 300만이라는 값을 salary에 저장해두고, 이 값을 t3메서드의 매개변수에
		//보냄. t3의 매개변수 salary는 t3 영역에 선언되므로, t3영역에서 계산된 값이 메인메서드의 salary값에 영향을 미치지 못한다.
		//ex. 앞집(main method) 철수와 옆집(t3 method) 철수는 이름은 철수로 같지만, 다른 사람이다.
		
		Sword sword = new Sword(); //객체를 만들어 준다. 클래스를 기본적으로 다루기 위해
		sword.name = "집행검";
		sword.damage = 500;
		mt3.info(sword); //mt3.info은 mt3의 멤버메서드 info를 사용하겠다는 의미
		System.out.println(sword.name); //**그림을 꼭 그려봐라. 어떤 데이터를 보내냐에 따라 값이 변할수도, 그대로일수도 있다.
		
		System.out.println("Main Method 종료");
	}

}
