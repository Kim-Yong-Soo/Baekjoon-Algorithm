package q1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
	static BufferedWriter bw;
	static int n, m, in_n[], in_m[];

	public static int binarySearch(int target) {
		int front = 0, behind = n - 1;
		while (front <= behind) {
			int mid = Math.round((front + behind) / 2);
			if (target < in_n[mid])
				behind = mid - 1;
			else if (target > in_n[mid])
				front = mid + 1;
			else if (target == in_n[mid]) {
				return mid;
			}
		}
		return -1;
	}

	public static void process() throws IOException {
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Arrays.sort(in_n);

		for (int i = 0; i < m; i++) {
			int target = in_m[i];
			int res = binarySearch(target);

			if (res >= 0)
				bw.write("1\n");
			else
				bw.write("0\n");
		}
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		in_n = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			in_n[i] = Integer.parseInt(st.nextToken());

		m = Integer.parseInt(br.readLine());
		in_m = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++)
			in_m[i] = Integer.parseInt(st.nextToken());
		br.close();

		process();
	}
}