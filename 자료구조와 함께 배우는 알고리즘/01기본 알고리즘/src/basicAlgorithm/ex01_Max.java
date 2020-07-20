package basicAlgorithm;

import java.util.Scanner;

public class ex01_Max {

	public static void main(String[] args) {
		
		//3개의 정수를 입력하고 최댓값을 구함
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("a: ");
		int a = sc.nextInt();
		
		System.out.print("b: ");
		int b = sc.nextInt();
		
		System.out.print("c: ");
		int c = sc.nextInt();
		
		//a,b,c의 최대를 구해서 max에 대입
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값: "+max);
		
		/*
		 * 1) max에 a를 대입
		 * 2) b값이 max보다 크면 b를 max에 대입
		 * 3) c값이 max보다 크면 c를 max에 대입
		 * 
		 * --> 순차적(concatenation) 구조
		 * --> 2,3은 if문 = 선택(selection) 구조
		 */
	}

}
