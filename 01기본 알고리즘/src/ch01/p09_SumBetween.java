package ch01;

public class p09_SumBetween {

	// a와 b사이의 합을 구하는 메서드
	static int sumOf(int a, int b) {
		
		int sum = 0;
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
				sum += i;
			}
		} else {
			for(int i=b; i<=a; i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOf(3,5));
		System.out.println(sumOf(6,4));

	}

}
