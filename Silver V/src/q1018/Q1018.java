package q1018;

import java.util.*;

public class Q1018 {
	public int checkMat(int[][] mat, int k, int p) {
		int res = 0, pre = mat[k][p];
		for (int i = k; i < 8 + k; i++) {
			for (int j = p; j < 8 + p; j++) {
				if (mat[i][j] != pre)
					res++;
				pre = (pre == 0) ? 1 : (pre == 1) ? 0 : 0;
			}
			pre = (pre == 0) ? 1 : (pre == 1) ? 0 : 0;
		}
		return Math.min(res, 64 - res);
	}

	public static void main(String[] args) {
		Q1018 ma = new Q1018();
		Scanner sc = new Scanner(System.in);
		int n, m, res = 64, y = 0;
		int[][] mat;

		n = sc.nextInt();
		m = sc.nextInt();
		mat = new int[n][m];

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			for (int j = 0; j < a.length(); j++) {
				mat[i][j] = (a.charAt(j) != 'B') ? 1 : 0; // W일때 1, B일때 0
			}
		}
		sc.close();

		for (int k = 0; k < n - 7; k++) {
			for (int p = 0; p < m - 7; p++)
				res = Math.min(res, ma.checkMat(mat, k, p));
			y++;
		}

		System.out.println(res);
	}
}