package q11399;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, line[], res = 0, pre;

		n = Integer.parseInt(br.readLine());
		line = new int[n];
		String line_tmp[] = br.readLine().split(" ");
		br.close();

		for (int i = 0; i < n; i++) {
			line[i] = Integer.parseInt(line_tmp[i]);
		}

		Arrays.sort(line);

		res += line[0];
		pre = line[0];
		for (int i = 1; i < n; i++) {
			res += pre + line[i];
			pre += line[i];
		}

		bw.write(String.valueOf(res) + "");
		bw.flush();
		bw.close();
	}

}
