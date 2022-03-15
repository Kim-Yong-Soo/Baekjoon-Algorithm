package q15596;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15596 {

	static long sum(int[] a) {
		long ans = 0;
		for (int num : a)
			ans += num;
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, a[];

		n = Integer.parseInt(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(br.readLine());
		br.close();

		bw.write(sum(a) + "");
		bw.flush();
		bw.close();
	}

}
