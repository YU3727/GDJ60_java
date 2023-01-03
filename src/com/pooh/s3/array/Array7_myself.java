package com.pooh.s3.array;

import java.util.Scanner;

public class Array7_myself {
//배열, Array7과 같은데 switch case 써보기. 한번 해보는거
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {5, 1, 4};
		
		//1. 데이터 추가 - 0번 인덱스에 추가. 나머진 뒤로 밀리기 (입력 받아서 추가)
		//2. 데이터 삭제 - 0번 인덱스를 삭제.
		//3. 종료 (3번 누를때까지 계속 하는것)
		
		//생각 정리 - 일단 while을 써야할듯? 종료 누를때까지 계속 해야하니까.(횟수 정해져있지 않음)
		//선택지에 따라서 while에 true, false 줘서 계속 진행하거나, 프로그램 끄거나
		//1번 고르면 데이터 추가, 2번 고르면 데이터 삭제, 3번 고르면 끄기
		
		
		boolean check = true; //프로그램 계속 돌릴건지 끌건지 결정

		while (check) {
			int select = 0;
			int figure = 0;
			int check2 = 0;
			
			//선택지 먼저 고르기
			System.out.println("작업을 선택해 주세요");
			System.out.println("1.데이터 추가\t2.데이터 삭제\t3.종료");
			select = sc.nextInt();
		
			//데이터 추가 하기
			switch (select) {
			case 1:
				System.out.println("추가할 데이터 값을 입력하세요");
				figure = sc.nextInt(); //입력 된 데이터
				
				int [] mod = new int[ar.length+1]; //mod배열은 ar배열보다 항상 1칸 길게.
			
				for(int i=0; i<ar.length; i++){
					mod[i+1] = ar[i];
				}
				mod[0] = figure;
			
				ar = mod; //배열 얕은 복사
				
				for(int i=0; i<mod.length; i++) {
					System.out.println("mod"+i+"값: "+ar[i]);
				}
			break;
				
			//데이터 삭제하기
			case 2:
				System.out.println("index0의 데이터가 삭제됩니다. 1.진행\t2.되돌아가기");
				check2 = sc.nextInt();
				
				if(check2 == 1){
					int [] mod2 = new int[ar.length-1];
					
					for(int i=0; i<mod2.length; i++) {
						mod2[i] = ar[i+1];
					}
					ar = mod2;
					
					for(int i=0; i<ar.length; i++) {
						System.out.println("mod"+i+"값: "+ar[i]);
					}
					break;
				}else if(check2 == 2) {
					break;
				}
				break;
				
			//프로그램 종료하기
			case 3:
				System.out.println("프로그램을 종료합니다");
				//select = 0;
				//figure = 0;
				check = false;
				break;
				
			//나머지 종류
			default:
				System.out.println("1, 2, 3번중에 선택해 주세요");
			}
		}
	}
}

