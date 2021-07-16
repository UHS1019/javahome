//동물 클래스 -부모
public class Animal {
	
	String species; //종
	String name; 	//이름
	int age;		//나이
	
	//기본형 생성자
	Animal(){}
	
	Animal(String name){
		System.out.println("Animal :" + name );
	}
	
	Animal(String name, int age){
		System.out.println("Animal :" + name + "Age : " + age);
	}
	
	void toPrint() {
		System.out.println("이 동물은 " + name);
	}
}



