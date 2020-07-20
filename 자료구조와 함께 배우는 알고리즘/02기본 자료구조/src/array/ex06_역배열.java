package array;

import java.util.Arrays;
import java.util.Random;

public class ex06_역배열 {

	static void swap(int[] array, int start, int end) {
		
		int tmp = array[start];
		array[start] = array[end];
		array[end] = tmp;
	}
	
	static void reverse(int[] array) {
		
		for(int i=0; i<array.length/2; i++) {
			swap(array, i, array.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] array = new int[random.nextInt(5)+1];
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println("array: "+Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("reversed array: "+Arrays.toString(array));
		

	}

}
