package q6321;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q6321 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			char in[] = br.readLine().toCharArray();
			String res ="";
			for (int j = 0; j < in.length; j++)
				res += (in[j] == 'Z') ? 'A' : (char) (in[j] + 1);

			bw.write("String #" + (i + 1) + "\n" + res + "\n\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}