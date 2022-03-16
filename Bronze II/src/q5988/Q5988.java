package q5988;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			char[] tmp = br.readLine().toCharArray();
			bw.write(((Integer.parseInt(tmp[tmp.length - 1] + "") % 2 == 0) ? "even" : "odd") + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}