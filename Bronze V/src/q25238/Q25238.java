package q25238;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q25238 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in[] = br.readLine().split(" ");
		int a = Integer.parseInt(in[0]), b = Integer.parseInt(in[1]);
		br.close();

		bw.write((((a - (a * 0.01 * b) < 100) ? "1" : "0")));
		bw.flush();
		bw.close();
	}

}
