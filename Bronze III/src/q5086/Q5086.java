package q5086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, b;

		while (true) {
			String in[] = br.readLine().split(" ");

			a = Integer.parseInt(in[0]);
			b = Integer.parseInt(in[1]);
			if (a == 0 && b == 0)
				break;
			else if (b % a == 0)
				bw.write("factor\n");
			else if (a % b == 0)
				bw.write("multiple\n");
			else
				bw.write("neither\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
