package ch01;

public class p03_min4 {

	// min value of 4 integers
	static int min4(int a, int b, int c, int d) {
		
		/*
		
		이렇게 하지 않아도 되었다...ㅠ
		
		int min = 0;
		int v1 = a, v2 = b;
		
		// c랑 d 비교 후 더 작은 값을 v2랑 비교
		if(c < d) {
			if(c < v2) v2 = c;
		}
		else {
			if(d < v2) v2 = d;
		}
		
		// v1랑 v2 비교 후 더 작은 값 = min
		if(v1 < v2) min = v1;
		else min = v2;
	
		return min;
		*/
		
		int min = a;         // 최솟값
	    if (b < min) min = b;
	    if (c < min) min = c;
	    if (d < min) min = d;

	    return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println(min4(1,2,3,4));
		System.out.println(min4(4,1,2,3));
		System.out.println(min4(3,4,1,2));
		System.out.println(min4(2,3,4,1));
		

	}

}
