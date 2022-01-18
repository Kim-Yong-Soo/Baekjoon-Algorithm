package q11720;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		String in;

		n = sc.nextInt();
		in = sc.next();
		sc.close();

		for (char i : in.toCharArray())
			sum += Character.getNumericValue(i);

		System.out.println(sum);
	}
}