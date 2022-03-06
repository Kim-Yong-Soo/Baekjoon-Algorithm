package q2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2750 { // 병합 정렬 알고리즘

	private static int tmp[];

	public static void mergeSort(int[] in2, int start, int end) {
		if (in2.length == end - start + 1)
			tmp = new int[in2.length];
		if (start < end) {
			int mid = start + (end - start) / 2;

			mergeSort(in2, start, mid);
			mergeSort(in2, mid + 1, end);
			merge(in2, start, mid, end);
		}
	}

	public static void merge(int[] in, int start, int mid, int end) {
		int a, b = 0, c = 0, d = start;

		for (a = start; a <= mid; a++)
			tmp[b++] = in[a];

		while (a <= end && c < b)
			in[d++] = (tmp[c] <= in[a]) ? tmp[c++] : in[a++];

		while (c < b)
			in[d++] = tmp[c++];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, in[];

		n = Integer.parseInt(br.readLine());
		in = new int[n];

		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(br.readLine());
		br.close();

		mergeSort(in, 0, in.length - 1);

		for (int i : in)
			bw.write(i + "\n");
		bw.flush();
		bw.close();
	}

}