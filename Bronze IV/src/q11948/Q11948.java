package q11948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in1[] = new int[4], e, f;

		for (int i = 0; i < 4; i++)
			in1[i] = Integer.parseInt(br.readLine());

		e = Integer.parseInt(br.readLine());
		f = Integer.parseInt(br.readLine());
		br.close();

		Arrays.sort(in1);

		bw.write((in1[1] + in1[2] + in1[3] + ((e > f) ? e : f)) + "");
		bw.flush();
		bw.close();
	}
}