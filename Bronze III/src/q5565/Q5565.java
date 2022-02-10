package q5565;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5565 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum, in[];

		in = new int[9];
		sum = Integer.parseInt(br.readLine());

		for (int i = 0; i < in.length; i++)
			in[i] = Integer.parseInt(br.readLine());
		br.close();

		for (int i : in)
			sum -= i;

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}