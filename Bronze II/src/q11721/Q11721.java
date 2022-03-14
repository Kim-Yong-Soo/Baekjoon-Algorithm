package q11721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in;
		int num;

		in = br.readLine();
		br.close();
		
		num = 0;
		for (int i = 0; i < in.length(); i++) {
			bw.write(in.charAt(i) + "");
			if (++num % 10 == 0)
				bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}