package for��;

import java.util.Scanner;

public class Main2438_�����1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {		
			//j�� ����ؼ� �����ϴ� ���� = i
			for (int j=1; j<=i; j++ ) {
				System.out.print("*");				
			}			
			System.out.println();
		}
	}
}
