package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1091 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] amdn = br.readLine().split(" ");
		long a = Long.valueOf(amdn[0]);
		long m = Long.valueOf(amdn[1]);
		long d = Long.valueOf(amdn[2]);
		long n = Long.valueOf(amdn[3]);
		
		long result = a;
		for (int i=1; i<n; i++) {
			result = result*m+d;
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
