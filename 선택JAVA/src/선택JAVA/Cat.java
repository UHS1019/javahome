package 선택JAVA;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		// 상위 <=== 하위 : 묵시적, Upcasting
		cat.name = "미미";
		cat.toPrint();
		
		// 하위 <=== Upcasting 되었던 상위, 명시적
		Cat cat2 = (Cat)cat;
		//cat2.toPrint();
		
	}

}
