package q2752;

import java.util.Scanner;

public class Q2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[3], out = new int[3];

		for (int i = 0; i < in.length; i++)
			in[i] = sc.nextInt();
		sc.close();

		for (int i = 0; i < in.length - 1; i++) {
			for (int j = 0; j < in.length - 1; j++) {
				if (in[j] > in[j + 1]) {
					int tmp = in[j + 1];
					in[j + 1] = in[j];
					in[j] = tmp;
				}
			}
		}

		for (int i : in)
			System.out.print(i + " ");
	}
}