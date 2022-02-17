package q1966;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

class Doc {
	private int num, rank;

	public Doc(int num, int rank) {
		this.num = num;
		this.rank = rank;
	}

	public int getNum() {
		return num;
	}

	public int getRank() {
		return rank;
	}
}

public class Q1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		LinkedList<Doc> queue;

		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			queue = new LinkedList<>();
			String in1[] = br.readLine().split(" ");
			String in2[] = br.readLine().split(" ");

			for (int j = 0; j < Integer.parseInt(in1[0]); j++)
				queue.add(new Doc(j, Integer.parseInt(in2[j])));

			int cnt = 0;
			while (true) {
				int situl = 0;
				Doc data = queue.poll();

				if (!queue.isEmpty()) {
					for (int k = 0; k < queue.size(); k++) {
						if (queue.get(k).getRank() > data.getRank()) {
							situl = 1;
							break;
						} else if (k == queue.size() - 1)
							cnt++;
					}
				} else {
					cnt++;
					break;
				}

				if (situl == 1) {
					queue.add(data);
					continue;
				} else if (situl == 0 && data.getNum() == Integer.parseInt(in1[1]))
					break;
			}
			bw.write(cnt + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}