package Stack;

import java.util.Scanner;

public class Main10828_스택_배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 명령의 수 N 입력받기
		int N = sc.nextInt();
		
		// 크기가 N인 배열 만들기
		int[] stack = new int[N];
		
		// 기본 배열의 index는 -1로 둔다. 이래야 처음 뭔가 넣었을 때 index가 0부터 시작하게됨
		int top = -1;
		
		for(int i=0; i<N; i++) {
			
			// 명령어 입력받기
			String input = sc.next();
			
			// switch문으로 명령어를 받아서 해당되는 명령 실행할 것
			switch(input) {
			
			case "push":
				top++;
				stack[top] = sc.nextInt();
				break;
				
			case "pop":
				if(top == -1) System.out.println(top);
				else {
					System.out.println(stack[top]);
					top--;
				}
				break;
			
			case "top":
				if(top == -1) System.out.println(top);
				else System.out.println(stack[top]);
				break;
			
			case "size":
				System.out.println(top+1);
				break;
			
			case "empty":
				if(top == -1) System.out.println(1);
				else System.out.println(0);
				break;
			}
		}

	}

}
