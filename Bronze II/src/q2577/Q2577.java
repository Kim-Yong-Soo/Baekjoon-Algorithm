package q2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a, b, c, res[] = new int[10];
		String mul;

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 0; i < res.length; i++)
			res[i] = 0;

		mul = Integer.toString(a * b * c);

		for (int i = 0; i < mul.length(); i++) {
			res[mul.charAt(i) - '0']++;
		}
		for (int i : res)
			bw.write(i + "\n");

		bw.flush();
		bw.close();
	}
}