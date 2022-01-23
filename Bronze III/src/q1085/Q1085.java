package q1085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[] = new int[4], min;
		String inS[];

		inS = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < 4; i++)
			in[i] = Integer.parseInt(inS[i]);
		in[2] = in[2] - in[0];
		in[3] = in[3] - in[1];

		min = in[0];
		for (int i : in)
			if (min > i)
				min = i;

		bw.write(min + "");
		bw.flush();
		bw.close();
	}
}