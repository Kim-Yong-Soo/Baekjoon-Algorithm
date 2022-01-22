package q10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, in[], max, min;
		String a[];

		n = Integer.parseInt(br.readLine());
		a = br.readLine().split(" ");
		br.close();
		in = new int[n];

		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(a[i]);

		max = in[0];
		min = in[in.length - 1];
		for (int i : in) {
			if (max < i)
				max = i;
			else if (min > i)
				min = i;
		}

		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}