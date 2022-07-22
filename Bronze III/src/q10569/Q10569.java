package q10569;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10569 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;

		t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String inp[] = br.readLine().split(" ");
			int res = Integer.parseInt(inp[0]) - Integer.parseInt(inp[1]);
			bw.write((-1 * res + 2) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
