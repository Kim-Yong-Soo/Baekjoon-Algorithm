package q10833;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10833 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, in[][], res;

		n = Integer.parseInt(br.readLine());
		in = new int[n][2];

		for (int i = 0; i < n; i++) {
			String tmp[] = br.readLine().split(" ");
			in[i][0] = Integer.parseInt(tmp[0]);
			in[i][1] = Integer.parseInt(tmp[1]);
		}
		br.close();

		res = 0;
		for (int[] i : in)
			res += i[1] % i[0];

		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}