package q2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] in = new int[9];
		int max, loc;

		for (int i = 0; i < in.length; i++)
			in[i] = Integer.parseInt(br.readLine());
		br.close();

		max = in[0];
		loc = 1;
		for (int i = 1; i < in.length; i++) {
			if (in[i] > max) {
				max = in[i];
				loc = i + 1;
			}
		}

		bw.write(max + "\n");
		bw.write(loc + "");
		bw.flush();
		bw.close();
	}
}