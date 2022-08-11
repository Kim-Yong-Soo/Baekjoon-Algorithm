package q1264;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1264 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp;
		int cnt;

		while (!(inp = br.readLine()).equals("#")) {
			cnt = 0;
			for (int i = 0; i < inp.length(); i++)
				if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o'
						|| inp.charAt(i) == 'u' || inp.charAt(i) == 'A' || inp.charAt(i) == 'E' || inp.charAt(i) == 'I'
						|| inp.charAt(i) == 'O' || inp.charAt(i) == 'U')
					cnt++;
			bw.write(cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
