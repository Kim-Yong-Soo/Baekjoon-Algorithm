package q12605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q12605 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			String inp[] = br.readLine().split(" ");
			String res = "";
			for (int j = inp.length - 1; j >= 0; j--)
				res += inp[j] + " ";
			bw.write("Case #" + i + ": " + res + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
