package q2902;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2902 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in[] = br.readLine().split("-");
		br.close();

		for (int i = 0; i < in.length; i++)
			bw.write(in[i].charAt(0) + "");

		bw.flush();
		bw.close();
	}

}
