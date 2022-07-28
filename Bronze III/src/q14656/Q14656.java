package q14656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q14656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, res = 0;

		n = Integer.parseInt(br.readLine());
		String inp[] = br.readLine().split(" ");
		br.close();

		for (int i = 1; i <= n; i++)
			if (i != Integer.parseInt(inp[i - 1]))
				res++;

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
