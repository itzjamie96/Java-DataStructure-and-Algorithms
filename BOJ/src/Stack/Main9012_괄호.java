package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9012_괄호 {

	public static void main(String[] args) {
		
		// VPS는 결국 '('와 ')'의 짝이 맞아야하는 것
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//명령어 갯수
		sc.nextLine();	// 공백 제거
		
		
		for(int i=0; i<T; i++) {
			
			String input = sc.nextLine();
			
			Stack<Character> stack = new Stack<Character>();
			
			// input을 char로 쪼갠다
			for (int j=0; j<input.length(); j++) {
				
				char c = input.charAt(j);
				
				if(c==')') {

					// 우선 ')'가 들어왔는데 스택이 비었다? 그럼 걍 틀린거임
					// 틀린 경우는 스택에 짝 없어서 남아있는 경우니까 스택에 넣어준다
					if(stack.empty()) stack.push(c);
					
					// 스택이 안비었다! 심지어 마지막 내용물이 '('다! 그럼 그 내용물을 pop해주자
					// '('가 먼저 들어오고  ')'가 들어온 경우는 짝이 제대로 맞는 경우
					else if(stack.peek()=='(') stack.pop();
				} 
				// '('가 들어올 때는 무조건 넣어주자
				else {
					stack.push(c);
				}
			}
			// 스택에 뭐가 있다 = ( ) 짝이 안맞은 것 = NO
			// 스택에 뭐가 없다 = ( ) 짝이 다 맞았음! = YES
			if(!stack.empty()) System.out.println("NO");
			else System.out.println("YES");
			
		}
	}
}
