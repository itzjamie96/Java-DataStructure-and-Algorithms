package array;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_배열비교 {

	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a 크기:");
		int na = sc.nextInt();
		
		System.out.println("배열 a 입력:");
		int[] a = new int[na];
		for(int i=0; i<na; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b 크기:");
		int nb = sc.nextInt();
		
		System.out.println("배열 b 입력:");
		int[] b = new int[nb];
		for(int i=0; i<nb; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		
		System.out.println("배열 a와 b는"+ (equals(a, b) ? "같습니다" :  "다릅니다"));
		

	}

}
