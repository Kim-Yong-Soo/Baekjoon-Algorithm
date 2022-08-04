package q18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Q18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			String inp[] = br.readLine().split(" ");

			if (inp[0].equals("push"))
				queue.add(Integer.parseInt(inp[1]));
			else if (inp[0].equals("pop"))
				bw.write((queue.isEmpty() ? "-1" : queue.poll()) + "\n");
			else if (inp[0].equals("size"))
				bw.write(queue.size() + "\n");
			else if (inp[0].equals("empty"))
				bw.write((queue.isEmpty() ? "1" : "0") + "\n");
			else if (inp[0].equals("front"))
				bw.write((queue.isEmpty() ? "-1" : queue.peek()) + "\n");
			else if (inp[0].equals("back"))
				bw.write((queue.isEmpty() ? "-1" : queue.peekLast()) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
