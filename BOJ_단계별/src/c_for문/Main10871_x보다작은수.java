package c_for��;

import java.util.Arrays;
import java.util.Scanner;

public class Main10871_x���������� {

	public static void main(String[] args) {
		/*
		 * 1. N,X �Է¹�rl
		 * 2. N�� ���ڵ� arr �迭�� �ֱ�
		 * 3. �迭 ��
		 * 		index 0~N����
		 * 		arr[i] < X ==> ���
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
