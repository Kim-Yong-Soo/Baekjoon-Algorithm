package q11729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729 {

	private static BufferedWriter bw;

	public static void hanoi(int mov, int start, int point, int end) throws IOException {
		if (mov == 1) {
			bw.write(start + " " + end + "\n");
		} else {
			hanoi(mov - 1, start, end, point);
			bw.write(start + " " + end + "\n");
			hanoi(mov - 1, point, start, end);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		br.close();

		bw.write((int) (Math.pow(2, n) - 1) + "\n");
		hanoi(n, 1, 2, 3);
		bw.flush();
		bw.close();
	}

}
