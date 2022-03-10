package q4504;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4504 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());

		while (true) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0)
				break;
			bw.write(tmp + " is " + ((tmp % n != 0) ? "NOT " : "") + "a multiple of " + n + ".\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}