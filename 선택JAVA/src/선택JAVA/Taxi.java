
public class Taxi extends Cars {
	
	//�ý� ������ �Ӽ� �߰� 
	int pay = 3000;
	
	//�ý� ������ �޼ҵ� �߰�
	void payUp() {
		pay += 100;
		System.out.println(name + " ������ " + pay);
	}
}
