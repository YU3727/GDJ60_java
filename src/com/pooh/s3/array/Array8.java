package com.pooh.s3.array;

import java.util.Scanner;

public class Array8 {
//배열, 정렬하기
	public static void main(String[] args) {
		
		int [] ar = {5, 9, 8, 3, 6};
		
		//내림차순 정렬 : 9, 8, 6, 5, 3 (처음이 높고 점점 낮아짐)
		//오름차순 정렬 : 3, 5, 6, 8, 9 (처음이 낮고 점점 높아짐)
		//ex. 쇼핑사이트에 판매순, 인기순 이런것들 쓸 때...
		//비교 순서.(이중 for문 사용)
		//index0의 값을 1,2,3,4와 비교. 더 크면 자리 바꾸기. 9 5 8 3 6 
		//index1의 값을 2,3,4와 비교. 더 크면 자리 바꾸기. 9 8 5 3 6
		//index2의 값을 3,4와 비교. 더 크면 자리 바꾸기. 9 8 5 3 6(2와 3비교) > 9 8 6 3 5(2와 4비교)
		//inder3의 값을 4와 비교. 더 크면 자리 바꾸기. 9 8 6 5 3 - 정렬 완료
		//크게 index0~3까지 1번돌고, 그 안에서 (1,2,3,4), (2,3,4)... 이렇게 돈다
		//안되면 검색 해보면서 해도 괜찮다.
		
		//생각 정리 - 처음 배열 보여주고, 1.오름차순 정렬, 2.내림차순 정렬 선택하기.
		//선택한대로 작업 수행하기. 배열 자리 바꿀 빈 배열이 있어야 할거같음. 원래배열1, 빈배열2(자리바꾼거 저장해둘거)
		//배열 말고 값만 저장해 둘 변수 하나 있어도 될듯
		
		  Scanner sc = new Scanner(System.in);

		  boolean check = true; 
		  int select = 0; //1=오름차순 / 2=내림차순 / 3=원래배열로 되돌리기 / 4=프로그램종료 / 그외 처음화면으로
		  //프로그램 시작
		  while(check) {
			  System.out.println("최초 배열 상태 : 5, 9, 8, 3, 6"); //확인용
			  System.out.println("정렬 방법을 선택해주세요");
			  System.out.println("1.오름차순  2.내림차순  3.원래 배열로 되돌리기  4.프로그램종료");
			  select = sc.nextInt();
			  
			  //코드 진행
			  if(select == 1) { //오름차순 만들기
				  int [] mod = new int[ar.length];
				  mod = ar; //테스트용
				  for(int i=0; i<ar.length; i++) {
					  for(int j=i; j<ar.length; j++) {
						  if(mod[i] > mod[j]) { // index0(mod[i=0])의 값이 다른것(mod[j])보다 크면 두개의 자리를 바꾸기
							  int num = mod[i]; // 임시num에 mod[i]값을 넣어두고 
							  mod[i] = mod[j]; // mod[i]에 더 작은 값인 mod[j]
							  mod[j] = num; //mod[j]에 원래 mod[i]값인 num을 넣기
						  }
					  }
				  }
				  ar = mod;
				  System.out.println("오름차순 배열 결과");
				  for (int i = 0; i < ar.length; i++) {
					  System.out.print(ar[i]+"  ");
				  }
				  System.out.println("\n==================");
			  }else if(select == 2) { //내림차순 만들기
				  int [] mod = new int[ar.length];
				  mod = ar; //테스트용
				  for(int i=0; i<ar.length; i++) {
					  for(int j=i; j<ar.length; j++) {
						  if(mod[i] < mod[j]) { // index0(mod[i=0])의 값이 다른것(mod[j])보다 작으면 두 개의 자리를 바꾸기
							  int num = mod[i]; // 임시num에 mod[i]값을 넣어두고 
							  mod[i] = mod[j]; // mod[i]에 더 큰 값인 mod[j]
							  mod[j] = num; //mod[j]에 원래 mod[i]값인 num을 넣기
						  }
					  }
				  }
				  ar = mod;
				  System.out.println("내림차순 배열 결과");
				  for (int i = 0; i < ar.length; i++) {
					  System.out.print(ar[i]+"  ");
				  }
				  System.out.println("\n=================="); 
			  }else if(select == 3) { //원래 배열로 되돌리기
				  int [] origin = {5, 9, 8, 3, 6};
				  ar = origin;
				  for (int i = 0; i < ar.length; i++) {
					System.out.print(ar[i]+"  ");
				  }
				  System.out.println("\n==================");
			  }else if(select == 4) { //프로그램 종료
				  check = false;
				  System.out.println("프로그램을 종료합니다");
			  }else {
				  System.out.println("1~4번중에 선택해주세요");
			  }
		  }
	}
}
