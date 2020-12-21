package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1097 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] board = new int[20][20];
		String[] tmp;
		for (int i=1; i<20; i++) {
			tmp = br.readLine().split(" ");
			for (int j=1; j<20; j++) {
				board[i][j] = Integer.valueOf(tmp[j-1]);
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		String[] inputs;
		
		for (int i=1; i<=n; i++) {
			inputs = br.readLine().split(" ");
			int x = Integer.valueOf(inputs[0]);
			int y = Integer.valueOf(inputs[1]);
			

			for (int j=1; j<20; j++) {
				if (board[x][j] == 0 ) board[x][j] = 1;
				else board[x][j] = 0;
			}
			for (int j=1; j<20; j++) {
				if (board[j][y] == 0 ) board[j][y] = 1;
				else board[j][y] = 0;
			}
		}		

		// print
		for (int i=1; i<20; i++) {
			for (int j=1; j<20; j++) {
				bw.write(board[i][j]+" ");
			}
			bw.write("\n");
		}	
		bw.flush();
	}
}
