package q1259;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String tmp = br.readLine();
			int res = 1;

			if (tmp.equals("0"))
				break;

			for (int i = 0; i < Math.round(tmp.length() / 2.0); i++) {
				if (tmp.charAt(i) != tmp.charAt(tmp.length() - (1 + i))) {
					res = 0;
					break;
				}
			}

			bw.write((res == 1) ? "yes\n" : "no\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}