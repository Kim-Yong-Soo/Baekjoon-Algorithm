package q2747;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2747 {

	static int fibonacci(int num) {
		if (num < 2)
			return num;

		int a = 0, b = 1;

		for (int i = 1; i < num; i++) {
			int tmp = b;
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