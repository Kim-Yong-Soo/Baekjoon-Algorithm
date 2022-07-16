package q2605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2605 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, res[], lst[], cnt;

		n = Integer.parseInt(br.readLine());
		lst = new int[n];

		cnt = 0;
		for (String s : br.readLine().split(" "))
			lst[cnt++] = Integer.parseInt(s);
		br.close();

		res = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				res[i] = 1;
			else {
				res[i] = i + 1;
				if (i >= lst[i] && lst[i] != 0) {
					for (int j = i; j > i - lst[i]; j--) {
						int tmp = res[j];
						res[j] = res[j - 1];
						res[j - 1] = tmp;
					}
				}
			}
		}

		for (int i : res)
			bw.write(i + " ");

		bw.flush();
		bw.close();

	}

}
