package 선택JAVA;

public class Book {
	//책 클래스를 만들어서 관리하려고 한다.
	//public :이름, 저자, 가격
	//private : 할인율
	String name;
	String author;
	int price;
	private double discount = 0.1;
	
	//생성자(3가지 정보를 이용하여 객체 생성)
	Book(String name, String author, int price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	//책의 이름과 저자를 출력하는 메소드 printBook()
	void printBook()
	{
		System.out.println(name + " " + author + " " + price);
		System.out.println("할인가격:" + (price - price*discount));
	}
	
}
