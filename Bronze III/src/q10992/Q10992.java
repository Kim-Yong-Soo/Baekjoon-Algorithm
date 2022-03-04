package q10992;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10992 { //Q10991과는 비슷하지만 다른 느낌
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				bw.write(" ");
			bw.write("*");
			if (i != n)
				for (int l = 0; l < 2 * (i - 1) - 1; l++)
					bw.write(" ");
			if (i != 1)
				bw.write("*");
			if (i == n)
				for (int l = 0; l < 2 * (i - 1) - 1; l++)
					bw.write("*");
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}