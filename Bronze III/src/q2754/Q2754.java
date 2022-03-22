package q2754;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Q2754 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Double> map = new HashMap<>() {
			{
				put("A+", 4.3);
				put("A0", 4.0);
				put("A-", 3.7);
				put("B+", 3.3);
				put("B0", 3.0);
				put("B-", 2.7);
				put("C+", 2.3);
				put("C0", 2.0);
				put("C-", 1.7);
				put("D+", 1.3);
				put("D0", 1.0);
				put("D-", 0.7);
				put("F", 0.0);
			}
		};

		String in = br.readLine();
		br.close();
		bw.write(map.get(in) + "");
		bw.flush();
		bw.close();
	}

}