package q15727;

import java.util.*;

public class Q15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, k = 0;

		l = sc.nextInt();
		sc.close();

		k = (int) (l / 5);
		System.out.println(l % 5 == 0 ? k : k + 1);
	}
}