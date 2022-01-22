package q2908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] in;

		in = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < 2; i++) {
			String tmp = "";
			for (int j = in[i].length() - 1; j >= 0; j--)
				tmp += in[i].charAt(j);
			in[i] = tmp;
		}

		bw.write(Integer.parseInt(in[0]) > Integer.parseInt(in[1]) ? in[0] : in[1] + "");
		bw.flush();
		bw.close();
	}
}