package q1764;

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

public class Q1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Integer> map = new HashMap<>(), res = new HashMap<>();
		int n, m;
		
		String inp[] = br.readLine().split(" ");
		n = Integer.parseInt(inp[0]);
		m = Integer.parseInt(inp[1]);
		
		for (int i = 0; i < n; i++)
			map.put(br.readLine(), 1);
		
		for (int i = 0; i < m; i++) {
			String in = br.readLine();
			if(map.containsKey(in))
				res.put(in, 2);
		}
		br.close();
		
		List<Map.Entry<String, Integer>> lst = new LinkedList<>(res.entrySet());

		Collections.sort(lst, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		bw.write(res.size() + "\n");
		for (Map.Entry<String, Integer> l : lst)
			bw.write(l.getKey() + "\n");
		bw.flush();
		bw.close();

	}

}
