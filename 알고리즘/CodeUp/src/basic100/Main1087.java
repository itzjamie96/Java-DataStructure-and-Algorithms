package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1087 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.parseInt(br.readLine());
		int i = 1;
		int sum = 0;
		while (sum < max) {
			sum += i;
			i++;
		}

		bw.write(String.valueOf(sum));
		bw.flush();
	}
}
