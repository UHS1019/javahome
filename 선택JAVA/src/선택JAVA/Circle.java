package 선택JAVA;

public class Circle {
	
	private final double pi = 3.141592;
	
	//원의 둘레 : 2 * 3.14 * r
	double round(int r) {
		return 2 * pi * r;
	}
	
	//원의 넓이 : 3.14 * r * r
	protected double area(int r) {
		return pi * r * r;
	}
}
