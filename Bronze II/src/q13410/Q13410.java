package q13410;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q13410 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb;

		String[] input = br.readLine().split(" ");
		br.close();
		int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]), maxx = 0;

		for (int i = 1; i <= k; i++) {
			sb = new StringBuffer(Integer.toString(n * i));
			int re = Integer.parseInt(sb.reverse().toString());
			if (maxx < re)
				maxx = re;
		}

		bw.write(maxx + "");
		bw.flush();
		bw.close();
	}

}
