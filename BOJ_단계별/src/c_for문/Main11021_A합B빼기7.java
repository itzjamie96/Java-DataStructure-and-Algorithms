package c_for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main11021_A��B����7 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int i=1; i<=T; i++) {
			
			String[] num = br.readLine().split(" ");

			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			//int sum = A+B;
			
			// ****** �׳� A+B�� ���� "AB"�� ����
			// ****** (A+B)�� ����� A�� B�� �������� ��������....
			bw.write("Case #"+ i + ": " + (A+B) + "\n");
		}
		bw.flush();
	}

}
