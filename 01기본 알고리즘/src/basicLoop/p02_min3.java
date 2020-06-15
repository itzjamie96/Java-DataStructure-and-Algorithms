package basicLoop;

public class p02_min3 {

	// min value of 3 integers
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < c) {
			if(b < min) min = b;			
		}
		else {
			if(c < min) min = c;			
		}

		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println(min3(1,2,3));
		System.out.println(min3(3,2,1));
		System.out.println(min3(55,66,33));
		System.out.println(min3(100,4,354));

	}

}
