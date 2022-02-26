package q10866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Q10866 { // Q10845와 Queue, Deque 차이 및 명령어 차이
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<>();
		String in[];
		int n;

		n = Integer.parseInt(br.readLine());
		in = new String[n];

		for (int i = 0; i < n; i++)
			in[i] = br.readLine();
		br.close();

		for (String s : in) {
			if (s.contains("push_front"))
				deque.addFirst(Integer.parseInt(s.split(" ")[1]));
			else if (s.contains("push_back"))
				deque.addLast(Integer.parseInt(s.split(" ")[1]));
			else if (s.contains("pop_front"))
				bw.write(((!deque.isEmpty()) ? deque.pollFirst() : -1) + "\n");
			else if (s.contains("pop_back"))
				bw.write(((!deque.isEmpty()) ? deque.pollLast() : -1) + "\n");
			else if (s.contains("size"))
				bw.write(deque.size() + "\n");
			else if (s.contains("empty"))
				bw.write(((deque.isEmpty()) ? 1 : 0) + "\n");
			else if (s.contains("front"))
				bw.write(((!deque.isEmpty()) ? deque.peekFirst() : -1) + "\n");
			else if (s.contains("back"))
				bw.write(((!deque.isEmpty()) ? deque.peekLast() : -1) + "\n");
		}

		bw.flush();
		bw.close();
	}
}