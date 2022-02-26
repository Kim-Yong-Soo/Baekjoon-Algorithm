package q2609;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609 {
	// 유클리드 호제법
	public static int process(int o, int t) {
		return (o % t == 0) ? t : process(t, o % t);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, m, gcm;

		st = new StringTokenizer(br.readLine());
		br.close();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		gcm = process(n, m);
		bw.write(gcm + "\n" + (n * m / gcm));
		bw.flush();
		bw.close();
	}
}