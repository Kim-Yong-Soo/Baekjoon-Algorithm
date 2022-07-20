package q2576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = 100, sum = 0;

		for (int i = 0; i < 7; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp % 2 == 1) {
				sum += tmp;
				if (min > tmp)
					min = tmp;
			}
		}
		br.close();
		bw.write((sum == 0 && min == 100) ? "-1" : sum + "\n" + min);
		bw.flush();
		bw.close();
	}

}
