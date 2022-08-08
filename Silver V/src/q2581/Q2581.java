package q2581;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine());
		br.close();

		boolean ok = false;
		int sum = 0, min = 10000;

		for (int i = M; i <= N; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					ok = true;
					break;
				}
			}
			if (!ok && i != 1) {
				sum += i;
				if (min > i)
					min = i;
			}
			ok = false;
		}

		bw.write((sum == 0) ? "-1\n" : sum + "\n" + min);
		bw.close();
	}

}
