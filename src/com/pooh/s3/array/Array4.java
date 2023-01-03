package com.pooh.s3.array;

public class Array4 {
//배열, 깊은 복사, 배열 늘리기
	public static void main(String[] args) {
		int [] ar1 = {1, 2, 3};
		//마지막 한칸을 추가해서 4도 넣고 싶음. 배열의 특성상 수정이 안되기 때문에 새 배열을 만들어서 복사한다
		
		//깊은 복사
		int [] copy = new int[ar1.length+1]; //나중에 변경될 것을 예상해서 프로그램을 짜면 좋다.
		
		for(int i=0; i<ar1.length; i++) {
			copy[i] = ar1[i];
		}
		copy[copy.length-1] = 4;
		
		ar1 = copy; //배열은 실제 크기가 늘어나는게 아니라, 새로 만들고 그 만든것을 참조하게 주소를 바꾸는 것이다.
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}
}
