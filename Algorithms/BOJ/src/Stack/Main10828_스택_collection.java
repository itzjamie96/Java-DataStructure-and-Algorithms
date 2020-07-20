package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10828_스택_collection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 명령의 수 N 입력받기
		int N = sc.nextInt();
		
		// 스택 생성
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			
			String input = sc.next();
			
			switch(input) {
			
			case "push":
				stack.push(sc.nextInt());
				break;
			
			case "pop":
				if(stack.empty()) System.out.println(-1);
				else {
					int pop = stack.pop();	
					System.out.println(pop);
				}
				break;

			case "top":
				if(stack.empty()) System.out.println(-1);
				else System.out.println(stack.peek());
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
			
			case "empty":
				if(stack.empty()) System.out.println(1);
				else System.out.println(0);
			}	
		}
	}
}
