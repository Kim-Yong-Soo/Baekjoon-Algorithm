package q2748;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2748 { //Q2747에서 int를 long으로 바꿔 범위를 키웠습니다.

	static long fibonacci(int num) {
		if (num < 2)
			return num;

		long a = 0, b = 1;

		for (int i = 1; i < num; i++) {
			long tmp = b;
			b = a + b;
			a = tmp;
		}
		return b;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		bw.write(fibonacci(n) + "");
		bw.flush();
		bw.close();
	}

}