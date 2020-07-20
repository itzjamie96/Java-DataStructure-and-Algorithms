package a_입출력;

import java.util.Scanner;

public class Main2588_곱셈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A,B;
	
		A = scan.nextInt();		
		B = scan.nextInt();
		
		//B의 자릿수 구하기
		int one, tenth, hund;
		
		one = B/100 * A;	
		tenth = B%100/10 * A;	
		hund = B%10 * A;		
		
		System.out.println(hund);
		System.out.println(tenth);
		System.out.println(one);
		System.out.println(hund + tenth*10 + one *100);

	}

}
