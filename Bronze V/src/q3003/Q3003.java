package q3003;

import java.util.*;

public class Q3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] whiteChess = new int[6], basicChess = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < whiteChess.length; i++)
			whiteChess[i] = sc.nextInt();
		sc.close();

		for (int j = 0; j < whiteChess.length; j++)
			System.out.print(basicChess[j] - whiteChess[j] + " ");
	}
}