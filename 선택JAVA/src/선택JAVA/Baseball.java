/*
��� ���� : Baseball
���� �ο� : 3��
��� ��Ģ :
	*/
package ����JAVA;

public class Baseball extends Sports{
	
	static int count;
	Baseball(){
		count++;
	}
	
	Baseball(String name, int player){
		this();
		this.name = name;
		this.player = player;
	}
	
	public void rule(){
		System.out.println("�߱��� ���ݰ� ����� �����ǰ� 9���� �� ���̴�.");
	}
	
	public static void main(String[] args) {
		
		Baseball bb = new Baseball("�߱�", 9);
		System.out.println("��� ����: " + bb.getName());
		System.out.println("���� �ο�: " + bb.getPlayer());	//���� �ο� : 3��
		System.out.println("��� ��Ģ: ");		//��� ��Ģ :
		bb.rule();
	}

}
