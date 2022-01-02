package q2753;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;

		year = sc.nextInt();
		sc.close();

		System.out.println((((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) ? 1 : 0);
	}
}