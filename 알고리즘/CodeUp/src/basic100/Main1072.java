package basic100;

import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		
		sc.nextLine();	//length �Է¹ް� ���͸Ա��
		
		String[] input = sc.nextLine().split(" ");
				
		for (String s : input) {
			System.out.println(s);
		}
		sc.close();		
	}
}
