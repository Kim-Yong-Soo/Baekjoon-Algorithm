package q9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		String in[];
		Stack<Character> stack;

		t = Integer.parseInt(br.readLine());
		in = new String[t];

		for (int i = 0; i < t; i++)
			in[i] = br.readLine();

		for (String s : in) {
			stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(')
					stack.push(s.charAt(i));
				else if (s.charAt(i) == ')') {
					if (((!stack.isEmpty()) ? stack.pop() : '.') != '(') {
						bw.write("NO\n");
						break;
					}
				}

				if (i == s.length() - 1)
					bw.write((stack.isEmpty()) ? "YES\n" : "NO\n");
			}
		}

		bw.flush();
		bw.close();
	}
}