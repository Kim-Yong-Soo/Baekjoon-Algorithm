package q1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		String inS;

		inS = br.readLine().trim();
		br.close();

		if (inS.length() != 0) {
			for (String s : inS.split(" "))
				cnt++;
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}