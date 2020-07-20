package basicLoop;

import java.util.Scanner;

public class p08_SumGauss {

	public static void main(String[] args) {
		/*
		 *  가우스의 공식
		 *  1 ~10: 
		 *  	1+10 = 11
		 *  	2+ 9 = 11
		 *  	3+ 8 = 11
		 *  	4+ 7 = 11
		 *  	5+ 6 = 11
		 *  => 11*5
		 *  => (n+1) * (n/2)
		 *  
		 *  근데! 홀수는 이게 안됨
		 *  1~9:
		 *  	1+9 = 10
		 *  	2+8 = 10
		 *  	3+7 = 10
		 *  	4+6 = 10
		 *  	5 남음ㅠ
		 *  
		 *  => 10*4 + 5
		 *  => (n+1) * (n/2) + (n+1)/2
		 *  
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int sum = (n+1)*(n/2) + (n%2 == 1 ? (n+1)/2 : 0);
		System.out.println(sum);

	}

}
