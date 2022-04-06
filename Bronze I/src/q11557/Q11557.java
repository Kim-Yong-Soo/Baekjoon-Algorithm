package q11557;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11557 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t;

		t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int max;
			String maxSchool;
			st = new StringTokenizer(br.readLine());
			maxSchool = st.nextToken();
			max = Integer.parseInt(st.nextToken());

			for (int j = 1; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				String sch = st.nextToken();
				int dr = Integer.parseInt(st.nextToken());

				if (max < dr) {
					maxSchool = sch;
					max = dr;
				}
			}
			bw.write(maxSchool + ((i + 1 != t) ? "\n" : ""));
		}

		br.close();
		bw.flush();
		bw.close();
	}

}