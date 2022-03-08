package q11024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11024 { // Q11023에서 n을 입력받아 반복문만 추가해주면 되는 문제

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, res;

		n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			res = 0;
			while (st.hasMoreTokens())
				res += Integer.parseInt(st.nextToken());
			bw.write(res + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}