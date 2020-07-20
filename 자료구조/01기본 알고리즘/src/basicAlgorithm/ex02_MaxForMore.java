package basicAlgorithm;

public class ex02_MaxForMore {

	//a,b,c의 최댓값 리턴
	static int max3(int a, int b, int c) {
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		//test cases
		
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// [A] a＞b＞c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// [B] a＞b＝c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// [C] a＞c＞b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// [D] a＝c＞b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// [E] c＞a＞b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// [F] a＝b＞c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// [G] a＝b＝c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// [H] c＞a＝b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// [I] b＞a＞c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// [J] b＞a＝c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// [K] b＞c＞a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// [L] b＝c＞a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// [M] c＞b＞a

	}


}
