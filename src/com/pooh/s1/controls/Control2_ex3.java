package com.pooh.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
//조건문, if else 예제, 급여계산
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID와 PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로 부터 ID와 PW를 입력받아서 로그인 처리를 하려고 한다. 로그인 성공이냐 실패냐를 출력
		Scanner sc = new Scanner(System.in);
		
		int gId = 0;
		int gPw = 0;
		String log = " ";
		
		System.out.println("ID 숫자 4자리를 입력해주세요");
		gId = sc.nextInt();
		System.out.println("PW 숫자 4자리를 입력해주세요");
		gPw = sc.nextInt();
		
		boolean flag = false;
		
		if(id == gId && pw == gPw) {
			log = "로그인 성공";
			flag = true;
		}else {
			log = "로그인 실패";
			flag = false;
		}

		//로그인이 성공 했을 때만 실행
		//급여를 입력
		//정규직이면 1을, 계약직이면 2를 입력 < 친절하게 메시지를 알려줘야함.
		//실급여 계산
		//정규직 : 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		
		if(flag) {
			System.out.println("급여입력");
			int salary = sc.nextInt(); //실급여
			
			System.out.println("정규직=1 / 게약직=2 여부를 입력해주세요");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("정규직 선택");
				int tax = 0;  //누적함수의 형태
				tax = tax + (int)(salary*0.02);
				tax = tax + (int)(salary*0.03);
				tax = tax + (int)(salary*0.01);
				tax = tax + (int)(salary*0.01);
				salary = salary - tax;
				
/*				int tax1 = (int)(salary*0.02); //고용보험세금
				int tax2 = (int)(salary*0.03); //의료보험
				int tax3 = (int)(salary*0.01); //국민연금
				int tax4 = (int)(salary*0.01); //산재보험
				int totalTax = tax1 + tax2 + tax3 + tax4; //정규직 실급여계산			
				salary = salary - totalTax;
*/				
			}else {
				System.out.println("계약직 선택");
				salary = (int)(salary*0.967); //게약직 실급여계산
			}
			System.out.println("실급여 예상액 : "+salary+"원");
		}else {
			System.out.println("ID/PW를 확인해주세요");
		}
		
	}

}
