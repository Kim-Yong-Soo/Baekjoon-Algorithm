package q3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[] = new int[10], rem[] = new int[42], cnt;

		for (int i = 0; i < 10; i++)
			in[i] = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 0; i < 42; i++)
			rem[i] = 0;

		for (int i : in)
			rem[i % 42]++;

		cnt = 0;
		for (int i : rem)
			if (i != 0)
				cnt++;

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}