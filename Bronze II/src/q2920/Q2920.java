package q2920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[];
		String s[], res = "";

		in = new int[8];
		s = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < s.length; i++)
			in[i] = Integer.parseInt(s[i]);

		for (int i = 0; i < 7; i++) {
			if (in[i + 1] == in[i] + 1) {
				res = "ascending";
			} else if (in[i + 1] == in[i] - 1) {
				res = "descending";
			} else {
				res = "mixed";
				break;
			}
		}

		bw.write(res);
		bw.flush();
		bw.close();
	}
}