package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1099 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] board = new int[10][10];
		String[] tmp = new String[10];
		for (int i=0; i<10; i++) {
			tmp = br.readLine().split(" ");
			for (int j=0; j<10; j++) {
				board[i][j] = Integer.valueOf(tmp[j]);
			}
		}
		int x = 1;
		int y = 1;
		
		goRight: 
			for (int i=x; i<9; i++) {
				goDown:
					for (int j=y; j<10; j++) {
						
						if (board[i][j] == 0) {
							board[i][j] = 9;
						}
						else if (board[i][j] == 2) {
							board[i][j] = 9;
							break goRight;
						}
						else if (board[i][j] == 1) {
							if (board[i+1][j-1] == 0) {
								board[i+1][j-1] = 9;								
							}
							y = j-1;
							break goDown;
						}
					}
			}
	
		// print
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				bw.write(board[i][j]+" ");
			}
			bw.write("\n");
		}	
		bw.flush();
	}
}
