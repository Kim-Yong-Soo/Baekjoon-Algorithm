package q11866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, k, q, l, res[];
		Queue<Integer> queue = new LinkedList<>();

		String in[] = br.readLine().split(" ");
		br.close();

		n = Integer.parseInt(in[0]);
		k = Integer.parseInt(in[1]);
		q = 0;
		l = 0;

		res = new int[n];
		for (int i = 0; i < n; i++)
			queue.add(i);

		while (!queue.isEmpty()) {
			if (++q == k) {
				res[l++] = queue.poll();
				q = 0;
			} else {
				queue.add(queue.poll());
			}
		}

		bw.write("<");
		for (int i = 0; i < res.length; i++) {
			if (i == res.length - 1)
				bw.write((res[i] + 1) + ">");
			else
				bw.write((res[i] + 1) + ", ");
		}
		bw.flush();
		bw.close();
	}
}