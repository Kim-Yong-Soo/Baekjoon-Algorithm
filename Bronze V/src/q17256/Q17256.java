package q17256;

import java.util.Scanner;

public class Q17256 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ac = new int[6];

		for (int i = 0; i < ac.length; i++)
			ac[i] = sc.nextInt();
		sc.close();

		System.out.println((ac[3] - ac[2]) + " " + (ac[4] / ac[1]) + " " + (ac[5] - ac[0]));
	}
}