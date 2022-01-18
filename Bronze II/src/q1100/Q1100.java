package q1100;

import java.util.Scanner;

public class Q1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[8][8];
		int n = 0, cnt = 0;

		for (int i = 0; i < 8; i++) {
			char[] in = sc.next().toCharArray();
			for (int j = 0; j < 8; j++)
				board[i][j] = in[j];
		}
		sc.close();

//		for (char[] j : board) {
//			for (char i : j) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < 8; i++) {
			for (int j = (n == 0) ? 0 : 1; j < 8; j += 2) {
				if (board[i][j] == 'F')
					cnt++;
			}
			n = (n == 0) ? 1 : 0;
		}

		System.out.println(cnt);
	}
}