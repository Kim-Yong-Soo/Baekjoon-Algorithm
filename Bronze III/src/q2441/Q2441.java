package q2441;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 0; i < n; i++)
			bw.write(" ".repeat(i) + "*".repeat(n - i) + "\n");
		bw.flush();
		bw.close();
	}
}