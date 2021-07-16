package 선택JAVA;

public class ShoppingMall {

	//[데이터]
	//상품 코드 : 문자열 code
	//쇼핑몰 총 재고 수량 : 정수 total
	String code;
	static int total;

	//[생성자] ShoppingMall(code)
	ShoppingMall(String code){
		this.code = code;
		System.out.println(code + " 등록");
	}
	
	//[기능]
	//재고를 더한다. : void addTotal(int count)
	//재고를 뺀다. : void subTotal(int count)
	//*total을 늘리거나 줄이게 되면 현재 모두 몇개인지 출력해준다.
	void addTotal(int count) {
		total += count;
		System.out.println("현재 총 재고:" + total);
	}
	
	void subTotal(int count) {
		//만약 감소할 count가 total보다 크면
		//에러 메시지를 보이고 return한다.
		if(count > total) {
			System.out.println("수량이 부족합니다.");
			return;
		}
		else {
			total -= count;
			System.out.println("현재 총 재고:" + total);
		}
	}
	
}
