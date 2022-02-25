package q2164;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<>();
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 1; i <= n; i++)
			queue.add(i);

		while (queue.size() != 1) {
			queue.poll();
			queue.add(queue.poll());
		}

		bw.write(queue.poll() + "");
		bw.flush();
		bw.close();
	}
}