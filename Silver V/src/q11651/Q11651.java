package q11651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Q11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		Integer xy[][];

		n = Integer.parseInt(br.readLine());
		xy = new Integer[n][2];

		for (int i = 0; i < xy.length; i++) {
			String tmp[] = br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(tmp[0]);
			xy[i][1] = Integer.parseInt(tmp[1]);
		}
		br.close();

		Arrays.sort(xy, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return (o1[1].equals(o2[1])) ? o1[0] - o2[0] : o1[1] - o2[1]; //Q11650에서 0과 1만 서로 변경
			}
		});

		for (Integer[] i : xy)
			bw.write(i[0] + " " + i[1] + "\n");
		bw.flush();
		bw.close();
	}
}