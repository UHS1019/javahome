package ����JAVA;

import java.util.*;

public class Day05_�ݺ���1 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++)
			System.out.println(i);
		
		for(int i = 0; i <= 10; i += 2)
			System.out.println(i);	//0 2 4 6 8 10
		
		for(int i = 10; i > 3; i -= 2)
			System.out.println(i);

		System.out.println("====================");
		
		//� �� N�� �Է¹޾Ƽ� N������ ¦���� �հ� Ȧ���� ���� ����Ͻÿ�.
		Scanner sc= new Scanner(System.in);
		System.out.println("N:");
		
		System.out.println("N �Է�:");
		int N = sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		for(int i = 1; i <= N; i++)
			if(i % 2 == 0)
				even_sum += i;
			else
				odd_sum += i;
		
		System.out.println("Ȧ���� ��:" + odd_sum);
		System.out.println("¦���� ��:" + even_sum);
		
	}

}
