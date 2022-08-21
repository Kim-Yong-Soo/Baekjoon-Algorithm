package q9086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String in = br.readLine();
			bw.write(in.charAt(0) + "" + in.charAt(in.length() - 1) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
