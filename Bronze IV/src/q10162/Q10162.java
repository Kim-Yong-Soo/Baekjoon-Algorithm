package q10162;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10162 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = 0, b = 0, c = 0, t; // a: 300s, b: 60s, c: 10s

		t = Integer.parseInt(br.readLine());
		br.close();

		if (t % 10 == 0) {
			a = t / 300;
			t -= a * 300;
			b = t / 60;
			t -= b * 60;
			c = t / 10;
			t -= c * 10;
		}

		if (t != 0)
			bw.write("-1");
		else
			bw.write(a + " " + b + " " + c);

		bw.flush();
		bw.close();
	}
}