package q1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in;
		int res[] = new int[26], max, r;
		char ch[];

		in = br.readLine();
		br.close();
		ch = in.toCharArray();

		// A:65, Z:90, a:97, z:122
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				res[(int) ch[i] - 65]++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				res[(int) ch[i] - 97]++;
			}
		}

		max = -1;
		r = -2;
		for (int i = 0; i < res.length; i++) {
			if (max < res[i]) {
				max = res[i];
				r = i;
			} else if (max == res[i])
				r = -2;
		}

		bw.write((char) (r + 65) + "");
		bw.flush();
		bw.close();
	}
}