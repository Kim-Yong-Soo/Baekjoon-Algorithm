package q2204;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = -1;
		ArrayList<String> res = new ArrayList<String>();

		while (true) {
			n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			ArrayList<String> words = new ArrayList<String>();
			String sorted[] = new String[n];

			for (int i = 0; i < n; i++) {
				words.add(br.readLine());
				sorted[i] = words.get(i).toLowerCase();
			}
			Arrays.sort(sorted);

			for (int i = 0; i < n; i++) {
				if (sorted[0].equals(words.get(i).toLowerCase())) {
					res.add(words.get(i));
					break;
				}
			}
		}
		br.close();

		for (int i = 0; i < res.size(); i++) {
			bw.write(res.get(i) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
