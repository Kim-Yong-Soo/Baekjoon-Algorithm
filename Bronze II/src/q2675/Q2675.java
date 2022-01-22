package q2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t, r[];
		String[] s;

		t = Integer.parseInt(br.readLine());
		r = new int[t];
		s = new String[t];

		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			r[i] = Integer.parseInt(input[0]);
			s[i] = input[1];
		}
		br.close();

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < r[i] * s[i].length(); j++)
				bw.write(s[i].charAt(j / r[i]));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}