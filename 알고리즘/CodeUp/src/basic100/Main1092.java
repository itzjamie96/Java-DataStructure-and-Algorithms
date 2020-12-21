package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1092 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] abc = br.readLine().split(" ");
		int a = Integer.valueOf(abc[0]);
		int b = Integer.valueOf(abc[1]);
		int c = Integer.valueOf(abc[2]);
		
		int day = 1;
		while (day%a != 0 || day%b != 0 || day%c != 0) {
			day++;
		}
		
		bw.write(String.valueOf(day));
		bw.flush();
	}
}
