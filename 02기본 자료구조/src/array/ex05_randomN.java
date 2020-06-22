package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex05_randomN {

	static int max(int[] a) {
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		// 랜덤 넘버 생성
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기: ");
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			//random.nextInt(n) = 0 ~ n-1까지의 난수
			array[i] = random.nextInt(11);
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("max: "+max(array));
		
		
	}
}
