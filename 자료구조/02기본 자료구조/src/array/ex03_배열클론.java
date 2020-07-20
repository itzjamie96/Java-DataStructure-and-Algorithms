package array;

public class ex03_배열클론 {

	public static void main(String[] args) {
		
		//배열.clone() = 배열 복제
		
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		System.out.print("a: ");
		for(int i=0; i<a.length; i++) 
			System.out.print(" "+a[i]);

		System.out.println();
		
		System.out.print("b: ");
		for(int i=0; i<b.length; i++) 
			System.out.print(" "+b[i]);
	}

}
