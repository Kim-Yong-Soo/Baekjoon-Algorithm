package q1032;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String in[] = new String[n];

		for (int i = 0; i < n; i++)
			in[i] = br.readLine();
		br.close();

		if (n == 1)
			bw.write(in[0]);
		else {
			for (int i = 0; i < in[0].length(); i++) {
				boolean isEqual = true;
				for (int j = 1; j < n; j++) {
					if (in[j - 1].charAt(i) != in[j].charAt(i)) {
						isEqual = false;
						break;
					}
				}
				bw.write(((isEqual) ? in[0].charAt(i) : "?") + "");
			}
		}
		bw.flush();
		bw.close();
	}

}
