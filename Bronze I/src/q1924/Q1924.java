package q1924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String dayss[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String inp[] = br.readLine().split(" ");
		br.close();

		int x = Integer.parseInt(inp[0]), y = Integer.parseInt(inp[1]), day = 0;

		for (int i = 0; i < x; i++)
			day += (i + 1 != x) ? days[i] : y;

		bw.write(dayss[day % 7]);
		bw.flush();
		bw.close();
	}

}
