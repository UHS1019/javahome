
public class Day08_ĸ��ȭ {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.setName("���ȣ");
		kim.setGrade(2);
		kim.print();
		
		System.out.println("getGrade ��� : " + kim.getGrade());
		System.out.println("getName ��� : " + kim.getName());

		kim.print();
		System.out.println(kim.print(3));
		
	}

}
