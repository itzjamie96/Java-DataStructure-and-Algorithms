package c_for��;

import java.util.Scanner;

public class Main2439_�����2_�Ųٷ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		/* 
		 * 1: ----*		- : N-i
		 * 2: ---**		* : i
		 * 3: --***
		 * 4: -****
		 * 5: *****
		 * 
		 * => �ΰ��� for���� �ʿ���!
		 */
		
		//���� ��Ÿ���� for��
		//�����̶� *�� println �ƴϰ� print�� ������! ��������
		for (int i=1; i<=N; i++) {	
			
			//����: N-i��
			for (int j=1; j<=N-i; j++) {
				System.out.print(" ");
			}
			//*: �׳� i��, ���� �ڿ� �;���
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			//�ٹٲ� ��������
			System.out.println();
		}
	} 

}
