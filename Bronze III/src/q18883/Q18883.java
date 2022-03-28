package q18883;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q18883 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, m;

		st = new StringTokenizer(br.readLine());
		br.close();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			for (int j = ((i - 1) * m) + 1; j <= i * m; j++)
				bw.write(j + ((j != i * m) ? " " : ""));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}