package q1964;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1964 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long cur = 5;
		br.close();

		for (int i = 1; i < n; i++)
			cur = (cur + (i + 2) * 3 - 2) % 45678;

		bw.write(cur + "");
		bw.flush();
		bw.close();
	}

}
