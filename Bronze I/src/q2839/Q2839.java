package q2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, r3, r5;

		n = Integer.parseInt(br.readLine());
		br.close();

		r5 = n / 5;
		r3 = (n - r5 * 5) / 3;
		while (r3 * 3 + r5 * 5 != n) {
			if (r5 > 0)
				r3 = (n - --r5 * 5) / 3;
			else if (r5 == 0 && r3 * 3 != n) {
				r3 = -1;
				break;
			}
		}

		bw.write(r3 + r5 + "");
		bw.flush();
		bw.close();
	}
}