package q10816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10816 {
	static BufferedWriter bw;
	static int n, m, in_n[], in_m[];
	static Map<Integer, Integer> map;

	public static void process() throws IOException {
		// 처리
		for (int i = 0; i < n; i++)
			map.put(in_n[i], (!map.isEmpty() && map.get(in_n[i]) != null) ? map.get(in_n[i]++) + 1 : 1);

		// 출력
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < m; i++)
			bw.write(((map.get(in_m[i]) != null) ? map.get(in_m[i]) : 0) + " ");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		map = new HashMap<>();

		// 입력
		n = Integer.parseInt(br.readLine());
		in_n = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			in_n[i] = Integer.parseInt(st.nextToken());

		m = Integer.parseInt(br.readLine());
		in_m = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++)
			in_m[i] = Integer.parseInt(st.nextToken());
		br.close();

		process();
	}
}