package q1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {
	public static void process(int n, int m) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[] = new int[m + 1];

		for (int i = 2; i <= m; i++)
			in[i] = i;

		for (int i = 2; i < m; i++) {
			if (in[i] == 0)
				continue;
			for (int j = 2 * i; j <= m; j += i)
				in[j] = 0;
		}

		for (int i : in)
			if (i != 0 && i >= n)
				bw.write(i + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n, m;

		st = new StringTokenizer(br.readLine());
		br.close();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		process(n, m);
	}
}