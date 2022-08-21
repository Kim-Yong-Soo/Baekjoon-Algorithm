package q2738;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		int n = Integer.parseInt(inp[0]), m = Integer.parseInt(inp[1]), res[][] = new int[n][m];

		for (int i = 0; i < n * 2; i++) {
			inp = br.readLine().split(" ");
			for (int j = 0; j < m; j++)
				res[i % n][j] += Integer.parseInt(inp[j]);
		}
		br.close();

		for (int[] re : res) {
			for (int r : re)
				bw.write(r + " ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
