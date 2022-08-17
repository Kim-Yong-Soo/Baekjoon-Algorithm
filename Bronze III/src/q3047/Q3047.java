package q3047;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q3047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" "), pos = br.readLine();
		br.close();

		int in[] = new int[inp.length];
		for (int i = 0; i < inp.length; i++)
			in[i] = Integer.parseInt(inp[i]);

		Arrays.sort(in);

		for (int i = 0; i < pos.length(); i++) {
			if (pos.charAt(i) == 'A')
				bw.write(in[0] + " ");
			else if (pos.charAt(i) == 'B')
				bw.write(in[1] + " ");
			else if (pos.charAt(i) == 'C')
				bw.write(in[2] + " ");
		}
		bw.flush();
		bw.close();
	}

}
