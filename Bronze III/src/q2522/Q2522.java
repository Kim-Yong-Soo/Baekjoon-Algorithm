package q2522;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		
		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n-i; k++)
				bw.write(" ");
			for (int j = 0; j < i; j++)
				bw.write("*");
			bw.write("\n");
		}

		for (int i = n; i > 1; i--) {
			for (int k = n-i+1; k > 0; k--)
				bw.write(" ");
			for (int j = 1; j < i; j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}