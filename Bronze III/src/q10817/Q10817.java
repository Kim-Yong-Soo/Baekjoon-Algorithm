package q10817;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[] = new int[3];
		String inS[];

		inS = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < in.length; i++)
			in[i] = Integer.parseInt(inS[i]);

		Arrays.sort(in);

		bw.write(in[1] + "");
		bw.flush();
		bw.close();
	}
}