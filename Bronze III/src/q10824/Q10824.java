package q10824;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String a, b, c, d;
		long x, y;

		st = new StringTokenizer(br.readLine());
		br.close();

		a = st.nextToken();
		b = st.nextToken();
		c = st.nextToken();
		d = st.nextToken();
		x = Long.parseLong(a + b);
		y = Long.parseLong(c + d);

		bw.write(x + y + "");
		bw.flush();
		bw.close();
	}

}