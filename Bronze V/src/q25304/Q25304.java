package q25304;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine()), summ = 0;

		for (int i = 0; i < n; i++) {
			String in[] = br.readLine().split(" ");
			summ += Integer.parseInt(in[0]) * Integer.parseInt(in[1]);
		}
		br.close();

		bw.write(((x == summ) ? "Yes" : "No"));
		bw.flush();
		bw.close();
	}

}
