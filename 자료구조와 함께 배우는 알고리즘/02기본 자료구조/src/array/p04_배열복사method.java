package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class p04_배열복사method {

	
	//배열 b의 모든 요소를 배열 a에 복사하는 메서드
	static void copy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
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
		copy(a,b);
		System.out.println("copy b to a: "+Arrays.toString(a));
		

	}

}
