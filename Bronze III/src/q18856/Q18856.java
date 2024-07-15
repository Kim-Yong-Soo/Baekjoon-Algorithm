package q18856;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q18856 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()), res[] = new int[n];
		br.close();

		res[0] = 1;
		res[1] = 2;
		res[n - 1] = 997;

		bw.write(n + "\n");
		for (int i = 0; i < n; i++) {
			if (i >= 2 && i < n - 1) {
				res[i] = res[i - 1] + 1;
			}
			bw.write(res[i] + " ");
		}
		bw.flush();
		bw.close();
	}

}
