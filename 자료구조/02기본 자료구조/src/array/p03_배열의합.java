package array;

import java.util.Arrays;
import java.util.Random;

public class p03_배열의합 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] array = new int[random.nextInt(5) + 1];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println("array: " + Arrays.toString(array));
		
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum of array: "+sum);

	}

}
