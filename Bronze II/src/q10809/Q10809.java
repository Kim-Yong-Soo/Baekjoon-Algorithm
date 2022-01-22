package q10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in;
		int[] res = new int[26];

		in = br.readLine();
		br.close();

		for (int i = 0; i < res.length; i++)
			res[i] = -1;

		for (int i = 0; i < in.length(); i++) {
			for (int j = 0; j < res.length; j++) {
				if (in.charAt(i) == (char) (97 + j)) {
					if (res[j] != -1)
						break;
					res[j] = i;
					break;
				}
			}
		}

		for (int i : res)
			bw.write(i + " ");
		bw.flush();
		bw.close();
	}
}