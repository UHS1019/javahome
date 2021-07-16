package 선택JAVA;

import java.util.*;

public class Day05_반복문1 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++)
			System.out.println(i);
		
		for(int i = 0; i <= 10; i += 2)
			System.out.println(i);	//0 2 4 6 8 10
		
		for(int i = 10; i > 3; i -= 2)
			System.out.println(i);

		System.out.println("====================");
		
		//어떤 수 N을 입력받아서 N까지의 짝수의 합과 홀수의 합을 출력하시오.
		Scanner sc= new Scanner(System.in);
		System.out.println("N:");
		
		System.out.println("N 입력:");
		int N = sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		for(int i = 1; i <= N; i++)
			if(i % 2 == 0)
				even_sum += i;
			else
				odd_sum += i;
		
		System.out.println("홀수의 합:" + odd_sum);
		System.out.println("짝수의 합:" + even_sum);
		
	}

}
