package q1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m, scores[];
		double sum;
		String in[];

		n = Integer.parseInt(br.readLine());
		scores = new int[n];
		in = new String[n];
		in = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < n; i++)
			scores[i] = Integer.parseInt(in[i]);

		m = scores[0];
		for (int s : scores)
			if (m < s)
				m = s;

		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (double) scores[i] / m * 100;
		}
		bw.write(sum / n + "");
		bw.flush();
		bw.close();
	}
}