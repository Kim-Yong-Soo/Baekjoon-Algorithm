package q5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int submit[] = new int[30];
		int res[] = new int[2];

		for (int i = 0; i < 28; i++) {
			int tmp = Integer.parseInt(br.readLine());
			submit[tmp - 1] = 1;
		}
		br.close();

		int n = 0;
		for (int i = 0; i < 30; i++)
			if (submit[i] == 0)
				res[n++] = i + 1;

		bw.write(((res[0] > res[1]) ? res[1] + "\n" + res[0] : res[0] + "\n" + res[1]));
		bw.flush();
		bw.close();
	}

}