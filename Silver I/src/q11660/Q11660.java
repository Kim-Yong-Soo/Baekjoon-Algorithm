package q11660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), intIn[][] = new int[n][n],
				tmp[][] = new int[n + 1][n + 1];

		// 입력 처리
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++)
				intIn[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				tmp[i + 1][j + 1] = tmp[i][j + 1] + tmp[i + 1][j] - tmp[i][j] + intIn[i][j];

		// 합 출력
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()),
					x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			bw.write((tmp[x2][y2] - tmp[x1 - 1][y2] - tmp[x2][y1 - 1] + tmp[x1 - 1][y1 - 1]) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
