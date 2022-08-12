package q10102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10102 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int v = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String inp = br.readLine();
		br.close();

		for (int i = 0; i < v; i++) {
			if (inp.charAt(i) == 'A')
				a++;
			else
				b++;
		}
		bw.write((a > b) ? "A" : (a == b) ? "Tie" : "B");
		bw.flush();
		bw.close();
	}

}
