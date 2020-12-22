package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1098 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] hw = br.readLine().split(" ");
		int h = Integer.valueOf(hw[0]);
		int w = Integer.valueOf(hw[1]);
		int[][] board = new int[h][w];
		
		int n = Integer.valueOf(br.readLine());
		String[] inputs;
		int l, d, x, y;
		for(int i=0; i<n; i++) {
			inputs = br.readLine().split(" ");
			l = Integer.valueOf(inputs[0]);
			d = Integer.valueOf(inputs[1]);
			x = Integer.valueOf(inputs[2])-1;
			y = Integer.valueOf(inputs[3])-1;
			
			if (d == 0) {
				for (int j=0; j<l; j++) {
					board[x][y+j] = 1;
				}
			} else {
				for (int j=0; j<l; j++) {
					board[x+j][y] = 1;
				}
			}
		}

		// print
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				bw.write(board[i][j]+" ");
			}
			bw.write("\n");
		}	
		bw.flush();
	}
}
