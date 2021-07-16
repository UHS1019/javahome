
public class Taxi extends Cars {
	
	//택시 고유의 속성 추가 
	int pay = 3000;
	
	//택시 고유의 메소드 추가
	void payUp() {
		pay += 100;
		System.out.println(name + " 현재요금 " + pay);
	}
}
