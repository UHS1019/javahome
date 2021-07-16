package 선택JAVA;

public class Day06_클래스1 {

	public static void main(String[] args) {

		//객체(인스턴스) 생성
		Car myCar1 = new Car();	//생성
		myCar1.소유자 = "어현수";
		myCar1.색상 = "BLUE";
		myCar1.제조회사 = "현대";
		myCar1.달리다();
		myCar1.정지하다();

		Car redCar = new Car();
		redCar.소유자 = "현빈";
		redCar.색상 = "GREEN";
		redCar.달리다();
		
		myCar1.달리다();
		myCar1.달리다();
		myCar1.달리다();
		redCar.달리다();
		redCar.달리다();
		redCar.정지하다();
		
	}

}

//--------------------------------------------

class Car
{
	//모델링-->클래스 정의
	//속성
	String 소유자;
	String 색상;
	String 제조회사;
	
	//메소드
	void 달리다()
	{
		System.out.println(소유자 + 색상 + ":달리는 중");
	}
	void 정지하다()
	{
		System.out.println(소유자 + 색상 + ":정지함");
	}
	
}

