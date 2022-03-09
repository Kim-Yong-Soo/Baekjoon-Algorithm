package q5692;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5692 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		while (true) {
			String tmp = br.readLine();
			int res = 0;
			if (tmp.equals("0"))
				break;

			for (int i = 1; i <= tmp.length(); i++) {
				int tm = 1;
				for (int j = 1; j <= i; j++)
					tm *= j;
				res += Integer.parseInt(tmp.charAt(tmp.length() - i) + "") * tm;
			}
			bw.write(res + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}