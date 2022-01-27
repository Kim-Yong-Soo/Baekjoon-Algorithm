package q11943;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11943 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[][] = new int[2][2], cnt;
		String tmp[];

		for (int i = 0; i < in.length; i++) {
			tmp = br.readLine().split(" ");
			for (int j = 0; j < tmp.length; j++)
				in[i][j] = Integer.parseInt(tmp[j]);
		}
		br.close();

		cnt = (in[0][0] + in[1][1] >= in[0][1] + in[1][0]) ? in[0][1] + in[1][0] : in[0][0] + in[1][1];

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}