package q1003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 기존에 피보나치 수를 구할 때는 재귀로 각각 구하였는데, 다이나믹 프로그래밍을 함으로써 처음 구해둔 피보나치 수 배열을 통해 중복되는 처리를 줄일 수 있었습니다.

public class Q1003 {

	private static int c0[], c1[], fib[];

	public static int fibo(int n) {
		if (n == 0) {
			c0[n] = 1;
			return n;
		} else if (n == 1) {
			c1[n] = 1;
			return n;
		}
		if (fib[n] > 0)
			return fib[n];

		fib[n] = fibo(n - 1) + fibo(n - 2);
		c0[n] = c0[n - 1] + c0[n - 2];
		c1[n] = c1[n - 1] + c1[n - 2];
		return fib[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine()), n;
		fib = new int[41];
		c0 = new int[41];
		c1 = new int[41];

		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			if (n > 1)
				fib[1] = 1;
			fibo(n);
			bw.write(c0[n] + " " + c1[n] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
