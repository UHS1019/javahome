package ����JAVA;

public class ShoppingMall {

	//[������]
	//��ǰ �ڵ� : ���ڿ� code
	//���θ� �� ��� ���� : ���� total
	String code;
	static int total;

	//[������] ShoppingMall(code)
	ShoppingMall(String code){
		this.code = code;
		System.out.println(code + " ���");
	}
	
	//[���]
	//��� ���Ѵ�. : void addTotal(int count)
	//��� ����. : void subTotal(int count)
	//*total�� �ø��ų� ���̰� �Ǹ� ���� ��� ����� ������ش�.
	void addTotal(int count) {
		total += count;
		System.out.println("���� �� ���:" + total);
	}
	
	void subTotal(int count) {
		//���� ������ count�� total���� ũ��
		//���� �޽����� ���̰� return�Ѵ�.
		if(count > total) {
			System.out.println("������ �����մϴ�.");
			return;
		}
		else {
			total -= count;
			System.out.println("���� �� ���:" + total);
		}
	}
	
}
