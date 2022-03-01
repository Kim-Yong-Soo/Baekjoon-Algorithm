package q4949;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack;

		while (true) {
			boolean res = true;
			stack = new Stack<>();
			String in = br.readLine();
			if (in.equals("."))
				break;

			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == '(' || in.charAt(i) == '[')
					stack.add(in.charAt(i));
				else if (in.charAt(i) == ')') {
					if (stack.isEmpty()) {
						res = !res;
						break;
					} else if (!stack.pop().equals('(')) {
						res = !res;
						break;
					}
				} else if (in.charAt(i) == ']') {
					if (stack.isEmpty()) {
						res = !res;
						break;
					} else if (!stack.pop().equals('[')) {
						res = !res;
						break;
					}
				}
			}
			bw.write((res && stack.isEmpty()) ? "yes\n" : "no\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}