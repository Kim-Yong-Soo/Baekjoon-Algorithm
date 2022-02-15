package q2108;

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

public class Q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, in[], sum, median, modeMax, range;
		Map<Integer, Integer> mode = new HashMap<>();

		n = Integer.parseInt(br.readLine());
		in = new int[n];

		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(br.readLine());
		br.close();

		Arrays.sort(in);
		median = in[in.length / 2]; // 중앙값 구하기
		range = in[in.length - 1] - in[0]; // 범위 구하기

		// 산술평균을 구하기 위한 덧셈
		sum = 0;
		for (int i : in) {
			sum += i;
			mode.put(i, (mode.containsKey(i)) ? mode.get(i) + 1 : 1);
		}

		// 최빈값 구하기
		List<Entry<Integer, Integer>> mList = new ArrayList<Entry<Integer, Integer>>(mode.entrySet());
		Collections.sort(mList, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()) == 0) ? o1.getKey().compareTo(o2.getKey())
						: o2.getValue().compareTo(o1.getValue());
			}
		});
		modeMax = (mList.size() > 1 && mList.get(0).getValue() == mList.get(1).getValue()) ? mList.get(1).getKey()
				: mList.get(0).getKey();

//		for (Entry<Integer, Integer> m : mList)
//			bw.write(m.getKey() + ": " + m.getValue() + ", ");

		bw.write((int) Math.round((double) sum / in.length) + "\n" + median + "\n" + modeMax + "\n" + range);
		bw.flush();
		bw.close();
	}
}