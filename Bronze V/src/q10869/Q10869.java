package q10869;

import java.util.*;

public class Q10869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		System.out.printf("%d\n%d\n%d\n%d\n%d", a + b, a - b, a * b, a / b, a % b);
	}
}