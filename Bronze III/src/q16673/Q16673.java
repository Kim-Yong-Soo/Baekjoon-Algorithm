package q16673;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q16673 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int c, k, p, sum;

		st = new StringTokenizer(br.readLine());
		br.close();

		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		sum = 0;

		for (int i = 1; i <= c; i++)
			sum += i * (k + p * i);

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}