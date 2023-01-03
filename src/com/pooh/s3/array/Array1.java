package com.pooh.s3.array;

public class Array1 {
//배열, 배열과 참조데이터의 관계, 메모리(노트 참고)
	public static void main(String[] args) { //메인 메서드는 stack메모리 영역에서 실행된다.
		//변수 타입은 크게 2가지
		//1.primitive type - 숫자(정수형-byte, shore, int, long/실수형-float, double), 문자(char), 논리형(boolean)
		//2.reference type - primitive type을 제외한 나머지. ex)String 
		
		double d1 = 1.2; // d1도 메인메서드 중괄호 내에서 선언 됐으므로 지역변수이다.
		d1 = 5.3;
		//변수 선언 공식
		//데이터타입 변수명; <- 변수명 앞에 나오는것이 데이터타입
		if(d1 > 0) {
			int num = 10;
		}
		
		
		
		//배열 선언 공식
		//모으려하는데이터타입 [] 변수명        //[]는 '배열'임을 나타내는 것.
		double [] arr = {1.2, 5.2, 6.3}; // arr은 double타입이 아니라 double배열(double []) 타입이다.
		
		double [] ar = new double[2];  // 우항의 []안에 모을 데이터의 갯수를 적어야한다.
		               //new라고 쓴것은 Heap 데이터 영역에 만드는거라고 생각하자.
		
		int [] ar2 = new int[3]; //heap에 만들어지는 ar2[] 배열값은 자동으로 초기화 된다.
		
		ar[0] = 3.3;
		ar[1] = 5.2;
		
		System.out.println(d1);
		System.out.println(ar); // @뒤의 값이 메모리의 주소. 결과 [D@3b6eb2ec
		System.out.println(ar[0]);
		System.out.println(ar2[0]); //heap영역에 만들어지는 데이터는 반자동으로 초기화가 된다.(즉, 초기화를 하지 않아도 값이 출력된다)
		
		int [] ar3 = {1, 2, 3};
		int ar4 [] = {2, 3, 4}; //이 방법도 사용은 가능하나, [ ]전까지만 봤을땐 변수선언과 같기 때문에 위 방법을 쓰는게 낫다.
		//index
		for(int i=0; i<3; i++) { //배열은 for반복문과 같이 많이 씀. i는 index의 i이다.
			System.out.println(ar3[i]);
		}
	}

}
