package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main9093_단어뒤집기_스택 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();	// 공백 제거
		
		for(int i=0; i<T; i++) {
			
			// 스택을 생성한다
			Stack<Character> stack = new Stack<Character>();

			// 각 문장 입력받고
			String input = sc.nextLine();
			
			
			for(int j=0; j<input.length(); j++) {
			
				// 문장을 char단위로 쪼개서 각 char마다 스택에 넣어줄 것이다
				char alphabet = input.charAt(j);

				// 근데 만약 char가 공백이라면
				if(alphabet == ' ') {
					
					// 그 전에 스택에 있는 것들을 스택이 empty할 때까지 pop()한다
					while(!stack.empty()) 
						System.out.print(stack.pop());
					
					// 그리고 잊지말고 띄어쓰기 해주기
					System.out.print(" ");
				}
				
				// 만약 char가 공백이 아니라면 = 그냥 알파벳이라면
				else {
					stack.push(alphabet);	//스택에 넣어주자
				}
			}
			
			// 위의 과정이 모두 끝나면 맨 마지막 단어만 스택에 남아있게된다
			while(!stack.empty()) 
				System.out.print(stack.pop());	// 스택이 빌 때까지 pop()해주자
			
			//잊지 말자. 각 문장 사이에 공백이 필요하다ㅠ
			System.out.println();
		}
		sc.close();

	}

}
