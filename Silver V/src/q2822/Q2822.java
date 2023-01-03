package q2822;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q2822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> scores = new HashMap<Integer, Integer>();

		for (int i = 0; i < 8; i++)
			scores.put(i, Integer.parseInt(br.readLine()));
		br.close();

		List<Entry<Integer, Integer>> scores_entry = new ArrayList<>(scores.entrySet());

		Collections.sort(scores_entry, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return -o1.getValue().compareTo(o2.getValue());
			}
		});

		int sum = 0, i = 0;
		int res[] = new int[5];
		for (Entry<Integer, Integer> entry : scores_entry) {
			if (i++ < 5) {
				sum += entry.getValue();
				res[i - 1] = entry.getKey() + 1;
			}
		}

		bw.write(sum + "\n");
		Arrays.sort(res);
		for (int r : res)
			bw.write(r + " ");
		bw.flush();
		bw.close();
	}

}
