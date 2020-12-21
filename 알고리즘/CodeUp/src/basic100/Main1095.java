package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1095 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split(" ");
		int min = 21476000;
		
		for (String s : inputs) {
			if (Integer.valueOf(s) < min) {
				min = Integer.valueOf(s);
			}
		}
		bw.write(String.valueOf(min));
		bw.flush();
	}
}
