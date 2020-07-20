package array;

import java.util.Arrays;
import java.util.Random;

public class p02_역순배열 {

	static void reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = tmp;
			System.out.println("arr["+i+"]와 "+"arr["+(arr.length -1 -i)+"]를 교환합니다");
		}

	}

	public static void main(String[] args) {
		Random random = new Random();

		int[] array = new int[random.nextInt(5) + 1];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println("array: " + Arrays.toString(array));

		reverse(array);

		System.out.println("reversed array: " + Arrays.toString(array));

	}

}
