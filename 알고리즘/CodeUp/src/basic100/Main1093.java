package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split(" ");
		
		int[] numbers = new int[23];
		
		for (int i=0; i<n; i++) {
			numbers[Integer.valueOf(inputs[i])-1] += 1;
		}
		
		for (int i: numbers) {
			bw.write(String.valueOf(i)+" ");
		}

		bw.flush();
	}
}
