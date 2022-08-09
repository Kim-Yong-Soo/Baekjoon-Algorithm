package q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int res[] = new int[10000], n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++)
			res[Integer.parseInt(br.readLine()) - 1]++;
		br.close();

		for (int i = 0; i < res.length; i++)
			bw.write(((i + 1) + "\n").repeat(res[i]));
		bw.flush();
		bw.close();

	}

}
