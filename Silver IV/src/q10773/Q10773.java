package q10773;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		long res;
		int n;

		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			if (in.equals("0") && !stack.isEmpty())
				stack.pop();
			else
				stack.add(Integer.parseInt(in));
		}
		br.close();

		res = 0;
		while (!stack.isEmpty())
			res += stack.pop();

		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}