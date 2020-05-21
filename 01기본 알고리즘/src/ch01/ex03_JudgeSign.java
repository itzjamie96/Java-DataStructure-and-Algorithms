package ch01;

import java.util.Scanner;

public class ex03_JudgeSign {
	
	public static void main(String[] args) {
		//입력한 정수가 양수인지 음수인지 0인지 판단

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		//양수
		if(n>0) System.out.println(n+"은 양수입니다");
		
		//음수
		else if(n<0) System.out.println(n+"은 음수입니다");
		
		//0
		else System.out.println(n+"은 0입니다");
		
		// 3항 연산자로 해보기
//		System.out.println((n>0)? "양수":(n<0)? "음수":"0");
		
		sc.close();
	}

}
