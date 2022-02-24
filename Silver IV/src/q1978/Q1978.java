package q1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {
	public static boolean check(int n) {
		if (n == 1)
			return false;
		else if (n == 2)
			return true;

		if (n % 2 == 0)
			return false;

		int m = (int) Math.sqrt(n);
		for (int i = 3; i <= m; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, cnt, in[];

		n = Integer.parseInt(br.readLine());
		in = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(st.nextToken());
		br.close();

		cnt = 0;
		for (int i : in)
			if (check(i))
				cnt++;

		bw.write(cnt + "");
		bw.flush();
		bw.close();

	}
}