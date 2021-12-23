package q21300;

import java.util.*;

public class Q21300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++)
			num[i] = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int j : num)
			sum += j;

		System.out.println(sum * 5);
	}
}