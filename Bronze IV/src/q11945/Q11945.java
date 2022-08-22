package q11945;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11945 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		int n = Integer.parseInt(inp[0]), m = Integer.parseInt(inp[1]);

		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			for (int j = m - 1; j >= 0; j--)
				bw.write(in.charAt(j) + "");
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
