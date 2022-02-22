package q2798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Q2798 {
	static int n, m, in[], max;

	public static void calcul() {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int s = in[i] + in[j] + in[k];
					if (s <= m && max < s)
						max = s;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		max = 0;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		in = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(st.nextToken());
		br.close();

		calcul();

		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}