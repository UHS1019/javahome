package 선택JAVA;

public class CircleMain extends Circle{

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println("월의 둘레:" + c.round(5));
		System.out.println("월의 넓이:" + c.area(5));

	}

}
