package q15873;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15873 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int res;
		String in;
		
		in = br.readLine();
		br.close();

		if (in.charAt(1) == '0')
			res = Integer.parseInt(in.substring(0, 2)) + Integer.parseInt(in.substring(2));
		else
			res = Integer.parseInt(in.charAt(0) + "") + Integer.parseInt(in.substring(1));

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
