package ch01;

public class p01_max4 {

	// max value of 4 integers
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		//testcase
		System.out.println(max4(1,2,3,4));
		System.out.println(max4(1,4,7,9));
		System.out.println(max4(4,3,2,1));
		System.out.println(max4(2,3,4,1));

	}

}
