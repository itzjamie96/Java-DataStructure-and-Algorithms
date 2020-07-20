package c_for문;

import java.util.Scanner;

public class Main10871_x보다작은수 {

	public static void main(String[] args) {
		/*
		 * 1. N,X 입력받rl
		 * 2. N의 숫자들 arr 배열에 넣기
		 * 3. 배열 비교
		 * 		index 0~N까지
		 * 		arr[i] < X ==> 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];

		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (arr[i]<X) {
				System.out.print(arr[i] +" ");			
			}
		}
		sc.close();

	}

}
