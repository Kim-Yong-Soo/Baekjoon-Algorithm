package q5596;

import java.util.Scanner;

public class Q5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[2];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < 4; j++)
				sum[i] += sc.nextInt();
		}
		sc.close();
		
		System.out.println((sum[0] == sum[1]) ? sum[0] : Math.max(sum[0], sum[1]));
	}
}