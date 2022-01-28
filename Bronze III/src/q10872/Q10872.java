package q10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, res = 1;

		n = Integer.parseInt(br.readLine());
		br.close();

		if (n != 0)
			for (int i = 1; i <= n; i++)
				res *= i;

		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}