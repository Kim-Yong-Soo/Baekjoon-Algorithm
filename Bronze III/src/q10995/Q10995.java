package q10995;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10995 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 0; i < n; i++) {
			String tmp = (i % 2 == 0) ? "" : " ";

			for (int j = 0; j < n - 1; j++)
				tmp += "* ";
			bw.write(tmp + "*\n");
		}
		bw.flush();
		bw.close();
	}

}
