package 선택JAVA;

import java.util.*;

public class Day02_연습2 {

	public static void main(String[] args) {
		// 이름(name), 국어,영어, 수학 점수를 입력
		// 총점(total)과 평균(avg) 구하는 프로그램
		// 국영수 점수는 int 배열(score)을 이용하자
		
		String name;
		int[] score = new int[3];
		int total=0;
		float avg;
		
		System.out.print("이름:");
		Scanner sc = new Scanner(System.in);
		
		name = sc.next();
		System.out.print("국어:");
		score[0] = sc.nextInt();
		System.out.print("영어:");
		score[1] = sc.nextInt();
		System.out.print("수학:");
		score[2] = sc.nextInt();
		
		//합
		for(int i=0; i<score.length; i++)
			total = total + score[i];
		System.out.println("합:" + total);
		
		//평균
		avg = (float) total/3 ;
		System.out.println("평균:" + avg);
		
		sc.close();
		
	}

}
