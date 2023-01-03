package com.pooh.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
//조건문 if ~ else if ~ else if ... else 예제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //스캐너로 입력받을 준비
		Random random = new Random();
		
		//Game : TRPG, 직업은 마법사
		String name = "Pooh";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "Oac";
		int monsterHp = 10;
		
		//1.hp포션, 2.mp포션, 3.마법공격1, 4.마법공격2, 5.턴넘기기
		//hp, mp 보충시 최대 40이 끝.
		//보충시 랜덤하게 0~40사이의 숫자를 받아서 hp, mp에 더하기
		//3번 4번은 누르면 프린트문만 나오게 일단 처리 해두기
		
		int input = 0; //행동을 정하는 변수

		System.out.println("행동을 선택해주세요 \n1.hp회복 \n2.mp회복 \n3.마법1 \n4.마법2 \n5.턴넘기기");
		input = sc.nextInt();
		//System.out.println(input); //input 확인

		if(input == 1) {
			int rand1 = random.nextInt(41);
			//System.out.println("변수1의 값 : "+rand1); //rand1값 확인
			hp = hp + rand1;
			if(hp>=40) {
				hp = 40;
			}
			System.out.println("hp의 값 : "+hp); //확인용
			System.out.println("mp의 값 : "+mp); //확인용, 변화 없어야함.
		}else if(input == 2) {
			int rand2 = random.nextInt(41);
			//System.out.println("변수2의 값 : "+rand2); //rand2값 확인
			mp = mp + rand2;
			if(mp>=40) {
				mp = 40;
			}
			System.out.println("hp의 값 : "+hp); //확인용, 변화 없어야함.
			System.out.println("mp의 값 : "+mp); //확인용
		}else if(input == 3) {
			//주문을 외우기, mp3 소모, 0~5이하의 수치를 공격
			int rand3 = random.nextInt(6);
			System.out.println("마법공격1을 사용합니다");
			mp = mp - 3;
			monsterHp = monsterHp - rand3;
			if(monsterHp == 10) {
				System.out.println("Dodge");
			}
			System.out.println("몬스터의 남은 HP : "+monsterHp);
			System.out.println("남은 MP : "+mp);
		}else if(input == 4) {
			//주문을 외우기, mp5 소모, 0~10이하의 수치를 공격
			int rand4 = random.nextInt(11);
			System.out.println("마법공격2를 사용합니다");
			mp = mp - 5;
			monsterHp = monsterHp - rand4;
			if(monsterHp == 10) {
				System.out.println("Dodge");
			}
			if(monsterHp == 0) {
				System.out.println("Critical Hit!");
			}
			System.out.println("몬스터의 남은 HP : "+monsterHp);
			System.out.println("남은 MP : "+mp);
		}else if(input == 5) {
			System.out.println("턴을 넘깁니다");
		}else {
			System.out.println("1~5사이의 행동만 입력해주세요");
		}
		
		//유저의 이름, HP, MP, 몬스터의 이름과 hp까지 마지막에 출력해주기.
		
		System.out.println("유저이름: "+name+"\t유저HP: "+hp+"\t유저MP: "+mp+"\t몬스터이름: "+monsterName+"\t몬스터HP: "+monsterHp);
		
/*		int test = random.nextInt(5); // 0~5 '미만'의 정수 하나를 리턴
		int test2 = random.nextInt(30); // 0~30 '미만'의 정수 하나를 리턴
		System.out.println("test : "+test);
		System.out.println("test2 : "+test2);
*/
	}

}
