package ch01;

import java.util.Scanner;

public class p11_자리수출력 {

	public static void main(String[] args) {
		// 정수의 자릿수 출력해주는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		String n = sc.next();
		
		int count = 0; 
		
		for(int i=0; i<n.length(); i++) {
			count++;
		}
				
		System.out.println("n은 "+count+"자리입니다");

	}

}
