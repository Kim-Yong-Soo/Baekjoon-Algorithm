package q3058;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3058 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t, in[], n, sum, min;

		t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			in = new int[7];
			n = 0;
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int inS = Integer.parseInt(st.nextToken());
				if (inS % 2 == 0)
					in[n++] = inS;
			}

			min = in[0];
			for (int num : in) {
				sum += num;
				if (min > num && num != 0)
					min = num;
			}

			bw.write(sum + " " + min + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}