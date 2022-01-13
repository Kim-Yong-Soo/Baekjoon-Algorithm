package q10797;

import java.util.Scanner;

public class Q10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		int[] ns = new int[5];

		n = sc.nextInt();
		for (int i = 0; i < ns.length; i++)
			ns[i] = sc.nextInt();
		sc.close();

		for (int s : ns)
			if (s == n)
				cnt++;

		System.out.println(cnt);
	}
}