package q4458;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4458 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			char[] in = br.readLine().toCharArray();
			if (97 <= in[0] && in[0] <= 122)
				in[0] = (char) (in[0] - 32);
			for (int j = 0; j < in.length; j++)
				bw.write(in[j] + "");
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}