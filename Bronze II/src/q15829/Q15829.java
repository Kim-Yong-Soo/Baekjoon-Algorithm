package q15829;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15829 { // long 타입을 사용해야 원활하게 문제를 풀 수 있었다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long res;
		String in;
		int l;

		l = Integer.parseInt(br.readLine());
		in = br.readLine();
		br.close();

		res = 0;
		for (int i = 0; i < l; i++) {
			double tmp = in.charAt(i) - 96;
			for (int j = 0; j < i; j++)
				tmp = tmp * 31 % 1234567891;
			res += tmp;
			res %= 1234567891;
		}

		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}