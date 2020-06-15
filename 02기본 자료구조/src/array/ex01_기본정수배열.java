package array;

public class ex01_기본정수배열 {

	public static void main(String[] args) {

		//정수 배열 선언
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = 74;
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] : "+a[i]);

	}

}
