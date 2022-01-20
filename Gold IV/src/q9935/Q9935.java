package q9935;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 처음에는 단순하게 생각하고 풀었지만, 문자열의 길이가 최대 100만자리인 것을 간과 한 문제
// 구상이 안된다고 인터넷을 찾아보다 코드 일부가 같아짐.
// 다음부터는 인터넷 참조를 줄이기로 결정함.

public class Q9935 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> st = new Stack<>(), tmp = new Stack<>();
		String bombS;

		for (char ch : br.readLine().toCharArray())
			st.push(ch);
		bombS = br.readLine();
		br.close();

		for (int i = 0; i < st.size(); i++) {
			tmp.push(st.get(i));
			if (tmp.size() >= bombS.length()) {
				boolean isB = false;
				for (int j = 0; j < bombS.length(); j++) {
					if (!(tmp.get(tmp.size() - bombS.length() + j).equals(bombS.charAt(j)))) {
						isB = true;
						break;
					}
				}
				if (!isB) {
					for (int k = 0; k < bombS.length(); k++)
						tmp.pop();
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char ch : tmp)
			sb.append(ch);

		bw.write((tmp.size() != 0) ? sb.toString() : "FRULA");
		bw.flush();
		bw.close();

		// 처음 코드
//		String bomb = "", in = "";
//
//		in = br.readLine();
//		bomb = br.readLine();
//		br.close();
//		while (in.indexOf(bomb) >= 0)
//			in = String.join("", in.split(bomb));
//
//		bw.write((in != "") ? in : "FRULA");
//		bw.flush();
//		bw.close();
	}
}