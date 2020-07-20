package Stack;

import java.util.Scanner;

public class Main9093_단어뒤집기_배열 {

	/*
	 * **********************
	 * System.out.print로 했을 때 시간초과
	 * StringBuilder 쓰니까 통과
	 * **********************
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문장 갯수 T 입력받기
		int T = sc.nextInt();
		
		// 공백 제거
		// returns the line that was skipped
		sc.nextLine();
		
		for(int i=0; i<T; i++) {
			
			StringBuilder sb = new StringBuilder();
			
			// 각 문장 받기
			String input = sc.nextLine();
			
			//각 문장을 공백 포함해서 쪼개기
			String[] words = input.split("\\b");
			
			for(int j=0; j<words.length; j++) {
				
				// 각 index를 charArray로 바꿨음
				char[] arr = words[j].toCharArray();
				
				// 각 char를 마지막 인덱스부터 sb에 붙여버림
				for(int k=arr.length-1; k>=0; k--) {
					sb.append(arr[k]);
				}				
			}
			
			// 각 sb를 출력했음
			System.out.println(sb.toString());
		}
	}

}
