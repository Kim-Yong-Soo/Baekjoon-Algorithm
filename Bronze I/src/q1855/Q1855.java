package q1855;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1855 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k = Integer.parseInt(br.readLine());
		String in = br.readLine(), res = "";
		br.close();

		boolean status = false;
		int n = 0;

		while (n < in.length()) {
			res += in.charAt((!status) ? n++ : --n);

			if (n != 0 && n % k == 0) {
				n += k;
				status = !status;
			}

			if (n == in.length() && status)
				res += in.charAt(--n);
		}

		for (int i = 0; i < k; i++)
			for (int j = i; j < res.length(); j += k)
				bw.write(res.charAt(j) + "");

		bw.flush();
		bw.close();
	}

}
