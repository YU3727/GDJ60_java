package com.pooh.s3.array;

import java.util.Scanner;

public class Array_ex1 {
//배열, 입력받아서 배열만들고 정보출력하기.
	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력(ex. a, b) *첫번째 학생의 모든정보는 index1에, 두번째 학생의 모든정보는 index2에..
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수학성적 입력
		//3번에 오면 a의 번호, 국어, 영어, 수학성적을 입력, 총평계산. 끝나면 b의 번호, 국어, 영어, 수학성적 입력, 총평계산
		//최종적으로는 모든 학생의 정보를 출력하기.
		//이름 번호 국어 영어 수학 총점 평균< 아래에 출력 쫙 되게끔.
		
		Scanner sc = new Scanner(System.in);
		
		//학생 수 입력받기
		System.out.println("학생의 수를 입력해주세요");
		int count = sc.nextInt();
		int [] num = new int [count]; //학생 수 입력에 쓸 num
		int k = 1;
		
		for(int i=0; i<num.length; i++) { //학생수로 번호 표시
			num[i] = k;
			k = k + 1;
		}
		
		//이름 입력 받기
		String [] names = new String [count]; //이름을 입력받은 배열 name
	
		for(int i=0; i<num.length; i++) { 
			System.out.println("학생의 이름을 순서대로 입력해주세요");
			String na = sc.next(); //이름 입력받은 것
			names[i] = na;
			System.out.println(names[i]);
		}
		
		//학생별 국어, 영어, 수학점수 입력받고 총점, 평균 계산되어 나오게
		int [] kscores = new int [count]; //국어점수 배열 kscore
		int [] escores = new int [count]; //영어점수 배열 escore
		int [] mscores = new int [count]; //수학점수 배열 mscore
		int [] sums = new int [count];    //총점 배열 sum
		double [] avgs = new double [count];    //평균 배열 avg
		
		for(int i=0; i<num.length; i++) {
				System.out.println(names[i]+"학생의 국어 점수를 입력하세요");
				kscores[i] = sc.nextInt();
				
				System.out.println(names[i]+"학생의 영어 점수를 입력하세요");
				escores[i] = sc.nextInt();
				
				System.out.println(names[i]+"학생의 수학 점수를 입력하세요");
				mscores[i] = sc.nextInt();
				
				sums[i] = kscores[i] + escores[i] + mscores[i];
				avgs[i] = sums[i]/3.0;
		}
		
		//출력하기
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<num.length; i++) {
			System.out.println(names[i]+"\t"+num[i]+"\t"+kscores[i]+"\t"+escores[i]+"\t"+mscores[i]+"\t"+sums[i]+"\t"+avgs[i]);
		}
		
	}

}
