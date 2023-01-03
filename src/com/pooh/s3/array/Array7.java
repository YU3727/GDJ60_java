package com.pooh.s3.array;

import java.util.Scanner;

public class Array7 {
//배열, stack메모리 자료구조 흉내내기.(FILO, First In, Last Out)
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
			
			//선택지 먼저 고르기
			System.out.println("작업을 선택해 주세요");
			System.out.println("1.데이터 추가\t2.데이터 삭제\t3.종료");
			select = sc.nextInt();
		
			//데이터 추가 하기
			if(select == 1) {
				System.out.println("추가할 데이터 값을 입력하세요");
				figure = sc.nextInt(); //입력 된 데이터
				
				int [] mod = new int[ar.length+1]; //mod배열은 ar배열보다  1칸 길게.
				mod[0] = figure; //mod0번 값은 항상 입력된 값으로 준다.
				
				for(int i=0; i<ar.length; i++){
					mod[i+1] = ar[i];
				}
				
				ar = mod; //배열 얕은 복사
				
				for(int i=0; i<mod.length; i++) {
					System.out.println("mod"+i+"값: "+ar[i]);
				}
			}
			
			//데이터 삭제하기
			if(select == 2) {
				int check2 = 0;
				System.out.println("index0의 데이터가 삭제됩니다. 1.진행\t2.되돌아가기");
				check2 = sc.nextInt();
				
				if(check2 == 1){
					int [] mod = new int[ar.length-1];
					
					for(int i=0; i<mod.length; i++) {
						mod[i] = ar[i+1];
					}
					
					ar = mod; //배열 얕은 복사
					
					for(int i=0; i<ar.length; i++) {
					System.out.println("mod"+i+"값: "+ar[i]);
					}
				
				}else if(check2 == 2){
					System.out.println("되돌아갑니다");
				}
	
			}
			
			//프로그램 종료하기
			if(select == 3) {
				System.out.println("프로그램을 종료합니다");
				//select = 0;
				//figure = 0;
				check = false;
			}else {
				System.out.println("1, 2, 3번중에 골라주세요");
			}	
		}
	}
}
