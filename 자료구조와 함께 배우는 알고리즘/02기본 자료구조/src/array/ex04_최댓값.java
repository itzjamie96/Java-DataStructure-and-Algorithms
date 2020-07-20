package array;

import java.util.Scanner;

public class ex04_최댓값 {

	static int max(int[] a) {
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}	
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//배열 값 입력
		System.out.print("N: ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		System.out.println("배열의 값을 입력해주세요 ");
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("배열의 요소 중 최댓값은 "+max(arr)+"입니다");

	}

}
