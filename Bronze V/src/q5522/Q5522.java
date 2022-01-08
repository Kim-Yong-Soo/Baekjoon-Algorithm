package q5522;

import java.util.*;

public class Q5522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			int input = sc.nextInt();
			score[i] = (0 <= input || input <= 100) ? input : 0;
		}
		sc.close();

		int sum = 0;
		for (int sco : score)
			sum += sco;
		System.out.println(sum);
	}
}