package ����JAVA;

public class ShoppingMallMain {

	public static void main(String[] args) {
		ShoppingMall TV = new ShoppingMall("LG 678A");
		TV.addTotal(10);
		TV.subTotal(4);
		
		ShoppingMall MP3 = new ShoppingMall("���̷��� L123");
		MP3.addTotal(100);
		MP3.subTotal(1000);
	}

}
