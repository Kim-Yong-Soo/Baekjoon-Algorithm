package q14924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q14924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		br.close();

		int s = Integer.parseInt(inp[0]), t = Integer.parseInt(inp[1]), d = Integer.parseInt(inp[2]);
		bw.write((d / (2 * s) * t) + "");
		bw.flush();
		bw.close();
	}

}
