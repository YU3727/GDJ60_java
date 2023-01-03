package com.pooh.s4.objects1;

public class ObjectsMain {
//Class와 Object
	public static void main(String[] args) {
		System.out.println("Start");
		//main method는 프로그램을 실행하는 목적.
		//test를 간단하게 해보기 위한 목적
		//main은 어느 클래스 안에 있던지 상관 없음.
		
		//학생 한명 생성
		//생성하는 방식은 변수 선언과 거의 동일
		//객체 생성 : 클래스명 변수명 = new 클래스명();
		Student student = new Student(); //우측의 new Student()를 좌측 student 변수에 담는다.
		//좌측식의 의미 : 변수 student에 Student 데이터타입을 담겠다.(Student는 데이터타입, student는 변수명)
		//new의 의미 : Heap이라는 영역에 공간을 확보하세요
		student.name = "test"; //이부분을 주석처리 하고 출력하면 'null'이 나온다. reference type의 초기값 = null
		student.num = 20; //학생의.번호 .(dot)연산.
		
		System.out.println(student); //결과값 : com.pooh.s4.objects1.Student@7c30a502, 골뱅이 뒷부분이 메모리 주소. 앞은 패키지주소
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg); //선언만 하고 초기화 하지 않아도 초기값이 들어가있다. heap에 만들어진 데이터는 자동초기화 됨.

		//학생객체 생성
		Student student2 = new Student();
		student2.name = "iu";
		student2.num = 30;
		int a = 20;
		int b = 10;
		a = b;
		
		//student의 데이터타입은 Student. 흔들리지 말고 정의한대로 생각하자.
		student = student2; //주소를 바꾸는 복사, 즉 얕은 복사이다. student의 값이 200번지가 됨.
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student2.name);
		
		//Garbage collector
		//메모리가 부족해지면 참조변수가 없어진 객체들을 Java가 지우러 오는데 이를 Garbage collector라 한다.
		
		
		System.out.println(student);
		
		
		
		System.out.println("Finish");
	}

}
