package q2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 병합 정렬 알고리즘은 학습 후 인터넷을 참고함.

public class Q2751 {
	static int[] tmp;

	public static void mergeSort(int[] a) {
		tmp = new int[a.length];
		mergeSort(a, 0, a.length - 1);
	}

	public static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int center = left + (right - left) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			merge(a, left, center, right);
		}
	}

	public static void merge(int[] a, int left, int center, int right) {
		int i, p = 0, j = 0, k = left;

		for (i = left; i <= center; i++)
			tmp[p++] = a[i];

		while (i <= right && j < p)
			a[k++] = (tmp[j] <= a[i]) ? tmp[j++] : a[i++];

		while (j < p)
			a[k++] = tmp[j++];
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

		mergeSort(in);

		for (int i : in)
			bw.write(i + "\n");

		bw.flush();
		bw.close();
	}
}