package q2851;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2851 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int now = 0, sum = 0, nowSum = 0;

		for (int i = 0; i < 10; i++) {
			now = Integer.parseInt(br.readLine());
			nowSum = sum + now;
			if (nowSum >= 100) {
				int ns = Math.abs(nowSum - 100), s = Math.abs(sum - 100);
				bw.write(((ns == s) ? ((nowSum > sum) ? nowSum : sum) : ((ns > s) ? sum : nowSum)) + "");
				break;
			} else if (i == 9)
				bw.write(nowSum + "");
			sum = nowSum;
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
