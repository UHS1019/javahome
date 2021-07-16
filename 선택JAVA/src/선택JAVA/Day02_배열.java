package 선택JAVA;

public class Day02_배열 {

	public static void main(String[] args) {
		int[] a = new int[5];	//선언, 사이즈 지정
		a[0] = 33;
		a[1] = 22;
		
		String[] str = new String[5];
		str[0] = "지호";
		str[1] = "현수";
		
		int[] c = new int[]{44,55,66,0,0} ; //값을 넣어서 사이즈 지정
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i] + str[i] +c[i]);
		}

	}

}
