package q1918;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q1918 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		String inp, res = "";

		inp = br.readLine();
		br.close();

		for (int i = 0; i < inp.length(); i++) {
			Character ch = inp.charAt(i);

			if (Character.isLetterOrDigit(ch))
				res += ch;
			else if (ch.equals('('))
				stack.push(ch);
			else if (ch.equals(')')) {
				while (!stack.isEmpty() && stack.peek() != '(')
					res += stack.pop();
				stack.pop();
			} else if (ch.equals('*') || ch.equals('/')) {
				while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/'))
					res += stack.pop();
				stack.push(ch);
			} else if (ch.equals('+') || ch.equals('-')) {
				while (!stack.isEmpty() && stack.peek() != '(')
					res += stack.pop();
				stack.push(ch);
			}
		}

		while (!stack.isEmpty())
			if (stack.peek() != '(')
				res += stack.pop();
			else
				stack.pop();

		bw.write(res);
		bw.flush();
		bw.close();
	}
}
