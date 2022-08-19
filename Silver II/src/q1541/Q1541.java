package q1541;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp = br.readLine(), now = "";
		br.close();
		int i, res = 0, re2 = 0;
		boolean status = false; // status false: +, true: -

		for (i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == '+') {
				if (!status)
					res += Integer.parseInt(now);
				else
					re2 += Integer.parseInt(now);
				now = "";
			} else if (inp.charAt(i) == '-') {
				if (!status)
					res += Integer.parseInt(now);
				else
					re2 += Integer.parseInt(now);
				status = true;
				now = "";
			} else
				now += inp.charAt(i) + "";

			if (i == inp.length() - 1)
				if (!status)
					res += Integer.parseInt(now);
				else
					res -= (re2 + Integer.parseInt(now));
		}

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
