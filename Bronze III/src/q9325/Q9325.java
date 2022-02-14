package q9325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9325 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t, s, n, qp[][];

		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			s = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			qp = new int[n][2];
			int res = 0;
			
			for (int j = 0; j < n; j++) {
				String tmp[] = br.readLine().split(" ");
				qp[j][0] = Integer.parseInt(tmp[0]);
				qp[j][1] = Integer.parseInt(tmp[1]);
			}
			for (int[] q : qp)
				res += q[0] * q[1];
			
			res += s;
			bw.write(res + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}