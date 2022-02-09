package q1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		Set<String> in;
		List<String> res;

		n = Integer.parseInt(br.readLine());
		in = new HashSet<>();

		for (int i = 0; i < n; i++)
			in.add(br.readLine());
		br.close();
		
		res = new ArrayList<String>(in);

		Collections.sort(res);
		Collections.sort(res, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});

		for (String s : res)
			bw.write(s + "\n");
		bw.flush();
		bw.close();
	}
}