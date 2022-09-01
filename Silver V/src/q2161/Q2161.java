package q2161;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q2161 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		ArrayList<Integer> queue = new ArrayList<>();

		for (int i = 1; i <= n; i++)
			queue.add(i);

		while (queue.size() != 0) {
			bw.write(queue.get(0) + " ");
			queue.remove(0);
			if (queue.size() != 0) {
				queue.add(queue.get(0));
				queue.remove(0);
			}
		}

		bw.flush();
		bw.close();
	}
}
