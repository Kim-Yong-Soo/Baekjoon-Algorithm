package q10953;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;

		t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String tmp[] = br.readLine().split(",");
			bw.write((Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}