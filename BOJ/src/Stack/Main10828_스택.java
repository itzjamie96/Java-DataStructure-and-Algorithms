package Stack;

import java.util.Scanner;

public class Main10828_스택 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] stack = new int[n];
		int top = -1;
		
		
		for (int i=0; i<n; i++) {
			String input = sc.next();
			
			switch (input) {
			
			case "push":
				top++;
				stack[top] = sc.nextInt();
				break;
				
			case "pop":
				if(top == -1) System.out.println(-1);
				else {
					System.out.println(stack[top]);
					top--;
				}
				break;
				
			case "size":
				System.out.println(top+1);
				break;
				
			case "empty":
				if(top == -1) System.out.println(1);
				else System.out.println(0);
				break;
				
			case "top":
				if(top == -1) System.out.println(top);
				else System.out.println(stack[top]);
				break;
			}
		}
		
		
	}

}
