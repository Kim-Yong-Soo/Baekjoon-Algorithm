package q1302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			map.put(in, (map.containsKey(in)) ? map.get(in) + 1 : 1);
		}
		br.close();

		int maxx = 0;
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			if (en.getValue() > maxx) {
				maxx = en.getValue();
				arr.clear();
				arr.add(en.getKey());
			} else if (en.getValue() == maxx)
				arr.add(en.getKey());
		}
		Collections.sort(arr);

		bw.write(arr.get(0));
		bw.flush();
		bw.close();
	}

}
