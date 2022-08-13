package q11170;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11170 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String inp[] = br.readLine().split(" ");
			int n = Integer.parseInt(inp[0]), m = Integer.parseInt(inp[1]), res = 0;

			for (int j = n; j <= m; j++) {
				int k = j;

				if (k == 0) {
					res++;
					continue;
				}

				while (k > 1) {
					if (k % 10 == 0)
						res++;
					k /= 10;
				}
			}
			bw.write(res + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
