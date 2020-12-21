package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1096 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] board = new int[19][19];
		
		int n = Integer.parseInt(br.readLine());
		String[] inputs;
		
		for (int i=0; i<n; i++) {
			inputs = br.readLine().split(" ");
			board[Integer.valueOf(inputs[0])-1][Integer.valueOf(inputs[1])-1] = 1;
		}
		
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				bw.write(board[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
