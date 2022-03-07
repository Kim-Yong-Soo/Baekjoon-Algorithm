package q11023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11023 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int res = 0;

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			res += Integer.parseInt(st.nextToken());

		br.close();
		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}