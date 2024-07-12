package q10768;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10768 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		br.close();

		if (a < 2 || (a <= 2 && b < 18)) {
			bw.write("Before");
		} else if (a == 2 && b == 18) {
			bw.write("Special");
		} else {
			bw.write("After");
		}

		bw.flush();
		bw.close();
	}

}
