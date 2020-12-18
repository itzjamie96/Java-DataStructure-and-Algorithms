package basic100;

import java.util.Scanner;

public class Main1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();		
		
		int hex = Integer.valueOf(s, 16);	//입력받은걸 16진수로 받음
		String ans;
		String tmp;
		for (int i=1; i<16; i++) {
			ans = Integer.toHexString(hex * i).toUpperCase();
			tmp = Integer.toHexString(i).toUpperCase();
			System.out.printf("%s*%s=%s\n", s, tmp, ans);
		}
	}
}
