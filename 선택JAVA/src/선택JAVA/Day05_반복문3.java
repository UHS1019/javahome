package 선택JAVA;

import java.util.*;

public class Day05_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무한루프로 어떤 수 N을 입력받아서
		// N이 3의 배수인지 아닌지에 대한 결과를 출력하자
		// 이때 0이 입력되면 반복문을 종료한다.
		// 만약 N이 3, 6, 9이면 출력하지 말고 다음 수를 입력받는다.
		
		int N;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("N:");
			N = sc.nextInt();
			if(N == 3 || N == 6 || N == 9)
				continue;
			if(N == 0)
				break;
			else if(N % 3 == 0)
				System.out.println(N + "은 3의 배수");
			else
				System.out.println(N + "은 3의 배수가 아님");

		}
		System.out.println("Bye~");
	}

}
