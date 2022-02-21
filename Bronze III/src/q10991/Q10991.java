package q10991;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				bw.write(" ");
			for (int k = 0; k < i; k++) {
				if (k != 0)
					bw.write(" ");
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}