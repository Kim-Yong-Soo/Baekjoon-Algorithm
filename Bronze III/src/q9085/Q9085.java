package q9085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, res[];

		n = Integer.parseInt(br.readLine());
		res = new int[n];

		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(br.readLine());

			String tmp[] = br.readLine().split(" ");

			for (int j = 0; j < t; j++)
				res[i] += Integer.parseInt(tmp[j]);
		}
		br.close();

		for (int r : res)
			bw.write(r + "\n");
		bw.flush();
		bw.close();
	}
}