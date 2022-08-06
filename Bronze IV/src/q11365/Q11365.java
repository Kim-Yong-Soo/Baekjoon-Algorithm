package q11365;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11365 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp;

		while (!(inp = br.readLine()).equals("END")) {
			for (int i = inp.length() - 1; i >= 0; i--)
				bw.write(inp.charAt(i));
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
