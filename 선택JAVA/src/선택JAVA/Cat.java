package ����JAVA;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		// ���� <=== ���� : ������, Upcasting
		cat.name = "�̹�";
		cat.toPrint();
		
		// ���� <=== Upcasting �Ǿ��� ����, �����
		Cat cat2 = (Cat)cat;
		//cat2.toPrint();
		
	}

}
