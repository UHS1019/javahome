package ����JAVA;

public class Day06_�л����� {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.name = "������";
		s1.hakbun = "20315";
		s1.age = 18;
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		// �������� ģ��(s2)�� ������ ȭ�鿡 ����Ͻÿ�
		Student s2 = new Student();
		s2.name = "������";
		s2.hakbun = "30111";
		s2.age = 19;
		s2.printStudent();
		
		//����° ģ��
		Student s3 = new Student("������", "20900", 20);
		s3.printStudent();
		
		//å�� ������ �����ϰ� ����غ���
		Book myBook = new Book("����", "�ڰ渮", 30000);
		myBook.printBook();
		
	}

}
