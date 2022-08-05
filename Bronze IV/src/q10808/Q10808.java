package q10808;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int res[] = new int[26];

		String s = br.readLine();
		br.close();

		for (int i = 0; i < s.length(); i++)
			res[(byte) (s.charAt(i)) - 97]++;

		for (int r : res)
			bw.write(r + " ");
		bw.flush();
		bw.close();
	}

}
