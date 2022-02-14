package q4153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[] = new int[3];

		while (true) {
			String tmp[] = br.readLine().split(" ");
			for (int i = 0; i < in.length; i++)
				in[i] = Integer.parseInt(tmp[i]);
			if (in[0] == 0 && in[1] == 0 && in[2] == 0)
				break;
			Arrays.sort(in);

			bw.write((in[0] * in[0] + in[1] * in[1] == in[2] * in[2]) ? "right\n" : "wrong\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}