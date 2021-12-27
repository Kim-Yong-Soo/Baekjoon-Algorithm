package q1330;

import java.util.*;

public class Q1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else if (a == b)
			System.out.println("==");
	}
}