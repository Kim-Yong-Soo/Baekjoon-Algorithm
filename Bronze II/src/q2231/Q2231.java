package q2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, res = 0;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = n - (9 * String.valueOf(n).length()); i < n; i++) {
			int tmp = i, r = 0;

			while (tmp != 0) {
				r += tmp % 10;
				tmp /= 10;
			}
			if (r + i == n) {
				res = i;
				break;
			}
		}

		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}