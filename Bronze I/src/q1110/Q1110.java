package q1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {

	static int n;

	public static int process(int prevNum) {
		int adNum = (prevNum < 10) ? prevNum : (int) (prevNum / 10) + prevNum % 10;
		int curNum = prevNum % 10 * 10 + adNum % 10;
		return ((curNum == n) ? 1 : process(curNum) + 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		br.close();

		bw.write(process(n) + "");
		bw.flush();
		bw.close();
	}

}
