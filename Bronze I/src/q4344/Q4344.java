package q4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());

		for (int i = 0; i < c; i++) {
			String inp[] = br.readLine().split(" ");
			int n = Integer.parseInt(inp[0]), sum = 0, res = 0;

			for (int j = 1; j <= n; j++)
				sum += Integer.parseInt(inp[j]);

			double avg = (double) sum / n;

			for (int j = 1; j <= n; j++)
				if (Integer.parseInt(inp[j]) > avg)
					res++;
			bw.write(String.format("%.3f", ((double) res / n) * 100) + "%\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
