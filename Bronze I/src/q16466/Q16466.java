package q16466;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q16466 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), in[] = new int[n];
		boolean no = false;
		String inp[] = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < inp.length; i++)
			in[i] = Integer.parseInt(inp[i]);

		Arrays.sort(in);

		for (int i = 0; i < in.length; i++) {
			if (in[i] != i + 1) {
				bw.write((i + 1) + "");
				no = true;
				break;
			}
		}

		if (!no)
			bw.write((n + 1) + "");
		bw.flush();
		bw.close();
	}

}
