package q2755;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2755 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, sum_of_hak;
		double sum;

		n = Integer.parseInt(br.readLine());
		sum_of_hak = 0;
		sum = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();

			int hak = Integer.parseInt(st.nextToken());
			sum_of_hak += hak;

			String grade = st.nextToken();
			double score;

			switch (grade) {
			case "A+":
				score = 4.3;
				break;
			case "A0":
				score = 4.0;
				break;
			case "A-":
				score = 3.7;
				break;
			case "B+":
				score = 3.3;
				break;
			case "B0":
				score = 3.0;
				break;
			case "B-":
				score = 2.7;
				break;
			case "C+":
				score = 2.3;
				break;
			case "C0":
				score = 2.0;
				break;
			case "C-":
				score = 1.7;
				break;
			case "D+":
				score = 1.3;
				break;
			case "D0":
				score = 1.0;
				break;
			case "D-":
				score = 0.7;
				break;
			default:
				score = 0.0;
				break;
			}

			sum += hak * score;
		}
		br.close();

		bw.write(String.format("%.2f", sum / sum_of_hak) + "");
		bw.flush();
		bw.close();
	}

}