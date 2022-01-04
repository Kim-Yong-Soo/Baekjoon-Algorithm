package q10039;

import java.util.Scanner;

public class Q10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++)
			scores[i] = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int score : scores)
			sum += (score < 40) ? 40 : score;

		System.out.println(sum / scores.length);
	}
}