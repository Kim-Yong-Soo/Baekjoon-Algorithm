package q11050;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11050 {

	public int fact(int n, int k) {
		int res = 1;
		for (int i = n; i > k; i--)
			res *= i;
		return res;
	}

	public static void main(String[] args) throws IOException {
		Q11050 main = new Q11050();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, k;
		String[] tmp;

		tmp = br.readLine().split(" ");
		br.close();
		n = Integer.parseInt(tmp[0]);
		k = Integer.parseInt(tmp[1]);

		bw.write(main.fact(n, k) / main.fact(n - k, 0) + "\n");
		bw.flush();
		bw.close();
	}
}