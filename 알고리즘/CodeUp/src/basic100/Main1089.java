package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1089 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] adn = br.readLine().split(" ");
		int result = Integer.valueOf(adn[1]) * Integer.valueOf(adn[2]) + Integer.valueOf(adn[0]) - Integer.valueOf(adn[1]);
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
