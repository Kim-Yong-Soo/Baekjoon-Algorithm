package q10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		String in[];
		Stack<Integer> stack = new Stack<>();

		n = Integer.parseInt(br.readLine());
		in = new String[n];

		for (int i = 0; i < n; i++)
			in[i] = br.readLine();
		br.close();

		for (String s : in) {
			if (s.contains("push"))
				stack.push(Integer.parseInt(s.split(" ")[1]));
			else if (s.contains("pop"))
				bw.write(((!stack.isEmpty()) ? stack.pop() : -1) + "\n");
			else if (s.contains("size"))
				bw.write(stack.size() + "\n");
			else if (s.contains("empty"))
				bw.write(((stack.empty()) ? 1 : 0) + "\n");
			else if (s.contains("top"))
				bw.write(((!stack.isEmpty()) ? stack.peek() : -1) + "\n");
		}

		bw.flush();
		bw.close();
	}
}