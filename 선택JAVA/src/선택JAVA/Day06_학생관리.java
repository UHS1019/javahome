package 선택JAVA;

public class Day06_학생관리 {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.name = "어현수";
		s1.hakbun = "20315";
		s1.age = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		// 여러분의 친구(s2)의 정보를 화면에 출력하시오
		Student s2 = new Student();
		s2.name = "김은수";
		s2.hakbun = "30111";
		s2.age = 19;
		s2.printStudent();
		
		//세번째 친구
		Student s3 = new Student("최유진", "20900", 20);
		s3.printStudent();
		
		//책의 정보를 생성하고 출력해보자
		Book myBook = new Book("토지", "박경리", 30000);
		myBook.printBook();
		
	}

}
