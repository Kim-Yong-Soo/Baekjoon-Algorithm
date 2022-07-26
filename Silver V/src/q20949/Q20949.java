package q20949;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q20949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		Map<Integer, Double> res;

		n = Integer.parseInt(br.readLine());
		res = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String inp[] = br.readLine().split(" ");
			int w = Integer.parseInt(inp[0]), h = Integer.parseInt(inp[1]);
			res.put(i+1, Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2)) / 77);
		}
		br.close();

		List<Map.Entry<Integer, Double>> lst = new LinkedList<>(res.entrySet());

		Collections.sort(lst, new Comparator<Entry<Integer, Double>>() {
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Map.Entry<Integer, Double> l : lst)
			bw.write(l.getKey() + "\n");
		bw.flush();
		bw.close();
	}

}
