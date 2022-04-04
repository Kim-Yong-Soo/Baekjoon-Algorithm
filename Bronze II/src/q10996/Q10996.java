package q10996;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 1; i <= 2 * n; i++) {
			if (i % 2 == 1)
				for (int j = 1; j <= n; j++)
					bw.write(((j % 2 == 1)) ? "*" : " ");
			else
				for (int j = 1; j <= n; j++)
					bw.write(((j % 2 == 1)) ? " " : "*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}