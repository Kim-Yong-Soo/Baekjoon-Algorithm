package q10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		String in[];
		Queue<Integer> queue = new LinkedList<>();

		n = Integer.parseInt(br.readLine());
		in = new String[n];

		for (int i = 0; i < n; i++)
			in[i] = br.readLine();
		br.close();

		for (String s : in) {
			if (s.contains("push"))
				queue.add(Integer.parseInt(s.split(" ")[1]));
			else if (s.contains("pop"))
				bw.write(((!queue.isEmpty()) ? queue.poll() : -1) + "\n");
			else if (s.contains("size"))
				bw.write(queue.size() + "\n");
			else if (s.contains("empty"))
				bw.write(((queue.isEmpty()) ? 1 : 0) + "\n");
			else if (s.contains("front"))
				bw.write(((!queue.isEmpty()) ? queue.peek() : -1) + "\n");
			else if (s.contains("back"))
				bw.write(((!queue.isEmpty()) ? queue.toArray()[queue.size() - 1] : -1) + "\n");
		}

		bw.flush();
		bw.close();
	}
}