
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.school = "서울예술고";
		System.out.println("김:" + kim.school);
		
		Student jang = new Student();
		Student bak = new Student();
		Student choi = new Student();
		System.out.println("최:" + choi.school);
		
		System.out.println("생성된 학생 수는 " + Student.count);
		
	}

}
