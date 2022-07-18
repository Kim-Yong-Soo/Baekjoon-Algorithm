package q13414;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q13414 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedHashSet<String> lhs;
		String inp[];
		int n, m, cnt;

		inp = br.readLine().split(" ");
		n = Integer.parseInt(inp[0]);
		m = Integer.parseInt(inp[1]);
		lhs = new LinkedHashSet<>();

		for (int i = 0; i < m; i++) {
			String in = br.readLine();
			if (lhs.contains(in))
				lhs.remove(in);
			lhs.add(in);
		}

		br.close();
		
		Iterator<String> iter = lhs.iterator();
		cnt = 0;
		while(iter.hasNext() && cnt++ < n)
			bw.write(iter.next() + "\n");

		bw.flush();
		bw.close();
	}

}
