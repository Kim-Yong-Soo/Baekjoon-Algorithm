package q2729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q2729 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			String in[] = br.readLine().split(" ");

			if (in[0].length() < in[1].length()) {
				String tmp = in[1];
				in[1] = in[0];
				in[0] = tmp;
			}

			for (int j = 0; j < in[0].length() + 1; j++) {
				res.add(0);
				if (j >= in[1].length() && j < in[0].length())
					in[1] = '0' + in[1];
			}
			for (int j = in[0].length() - 1; j >= 0; j--) {
				if (res.get(j + 1) == 1 && in[0].charAt(j) == '1') {
					res.set(j, 1);
					res.set(j + 1, 0);
				} else if (res.get(j + 1) != 1)
					res.set(j + 1, Character.getNumericValue(in[0].charAt(j)));

				if (res.get(j + 1) == 1 && in[1].charAt(j) == '1') {
					res.set(j, 1);
					res.set(j + 1, 0);
				} else if (in[1].charAt(j) == '1')
					res.set(j + 1, 1);
			}

			while (res.get(0) == 0 && res.size() > 1)
				res.remove(0);

			StringBuilder sb = new StringBuilder();
			for (Integer s : res)
				sb.append(s);

			bw.write(sb + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
