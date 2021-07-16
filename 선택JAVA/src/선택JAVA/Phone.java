
public class Phone {

	String model;
	int price;
	static int total;
	
	Phone(){total++;}	//기본형 생성자 
	Phone(String model, int price){
		this();
		this.model = model;
		this.price = price;
	}
	
	String toPrint() {
		System.out.println("현재까지 총 " + total + "개의 폰 있음");
		return(price + "만원짜리 " + model + "스마트폰");
	}
	
}
