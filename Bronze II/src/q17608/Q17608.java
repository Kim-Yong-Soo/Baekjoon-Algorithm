package q17608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q17608 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int inp[] = new int[n], cur, res = 1;

		for (int i = 0; i < n; i++)
			inp[i] = Integer.parseInt(br.readLine());
		br.close();

		cur = inp[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (inp[i] > cur) {
				res++;
				cur = inp[i];
			}
		}

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
