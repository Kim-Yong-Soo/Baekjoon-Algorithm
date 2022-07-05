package q10870;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {

	public static int fibo(int n) {
		return (n == 1 || n == 2) ? 1 : fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		bw.write(((n != 0) ? fibo(n) : 0) + "");
		bw.flush();
		bw.close();
	}

}
