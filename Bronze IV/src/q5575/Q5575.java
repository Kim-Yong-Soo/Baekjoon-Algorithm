package q5575;

import java.util.Scanner;

public class Q5575 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] cal = new int[3][6];

		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++)
				cal[i][j] = sc.nextInt();
		}
		sc.close();

		for (int[] calenda : cal) {
			int hour = calenda[3] - calenda[0];
			int minute = calenda[4] - calenda[1];
			int second = calenda[5] - calenda[2];

			if (second < 0) {
				minute -= 1;
				second += 60;
			}
			if (minute < 0) {
				hour -= 1;
				minute += 60;
			}
			System.out.println(hour + " " + minute + " " + second);
		}
	}
}