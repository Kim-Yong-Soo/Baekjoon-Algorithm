package q10101;

import java.util.Scanner;

public class Q10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		System.out.println((a == 60 && b == 60 && c == 60) ? "Equilateral"
				: (a + b + c == 180) ? (a == b || b == c || a == c) ? "Isosceles" : "Scalene" : "Error");
	}
}