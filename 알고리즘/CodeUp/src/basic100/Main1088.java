package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1088 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.parseInt(br.readLine());

		for (int i=0; i<=max; i++) {
			if (i%3 != 0) {
				bw.write(String.valueOf(i)+" ");				
			}
		}

		bw.flush();
	}
}
