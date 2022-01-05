package q4299;

import java.util.Scanner;

public class Q4299 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add, sub;

		add = sc.nextInt();
		sub = sc.nextInt();
		sc.close();

		int aps = add + sub;
		int a = aps / 2, b = add - a;
		if (a + b == add && a - b == sub && add >= sub)
			System.out.println(a + " " + b);
		else
			System.out.println("-1");
	}
}