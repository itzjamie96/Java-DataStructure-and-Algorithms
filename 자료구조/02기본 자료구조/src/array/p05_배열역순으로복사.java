package array;

import java.util.Arrays;
import java.util.Random;

public class p05_배열역순으로복사 {

	//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
	static void reverseCopy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-1-i];
		}
		
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(5)+1;
		
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<b.length; i++) {
			b[i] = random.nextInt(10);
		}
		System.out.println("b: "+Arrays.toString(b));
		reverseCopy(a,b);
		System.out.println("reverse copy b to a: "+Arrays.toString(a));

	}

}
