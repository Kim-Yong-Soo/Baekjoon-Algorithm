package q2446;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2446 { //Q2444 코드 순서 및 객체 i 값 변경
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - i; j++)
				bw.write(" ");
			for (int k = 0; k < 2 * i - 1; k++)
				bw.write("*");
			bw.write("\n");
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				bw.write(" ");
			for (int k = 0; k < 2 * i - 1; k++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}