package q1769;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1769 {
	private static int sum, n;
	private static String x;
	private static boolean res;

	static void process() {
		sum = 0;

		for (int i = 0; i < x.length(); i++)
			sum += x.charAt(i) - 48;
		if (1 < x.length())
			n++;

		if (sum / 10 != 0) {
			x = String.valueOf(sum);
			process();
		} else if (sum % 3 == 0)
			res = true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		res = false;
		n = 0;

		x = br.readLine();
		br.close();

		process();
		bw.write(n + "\n" + ((res) ? "YES" : "NO"));
		bw.flush();
		bw.close();
	}

}