package array;

import java.util.Arrays;
import java.util.Random;

public class p01_랜덤배열크기와랜덤요소 {

	static int max(int a[]) {
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if (a[i]>max)
				max = a[i];
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// random.nextInt(n)은 0부터 n-1까지의 랜덤수를 생성하기 때문에
		// 배열의 크기를 위해서는 +1을 해줘야함 (=크기가 0인 배열은 생성할 수 없음)
		int[] array = new int[random.nextInt(5)+1];
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println("array: "+Arrays.toString(array));
		System.out.println("max: "+max(array));
		
		

	}

}
