package q1789;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long s, sum;
		int cnt, num;

		s = Long.parseLong(br.readLine());
		br.close();

		cnt = 0;
		num = 1;
		sum = 0;
		while (sum != s) {
			sum += num;
			num++;
			cnt++;
			if (sum > s) {
				cnt--;
				break;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}

}
