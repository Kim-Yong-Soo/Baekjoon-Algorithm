package q2475;

import java.util.Scanner;

public class Q2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[5];

		for (int i = 0; i < in.length; i++)
			in[i] = sc.nextInt();

		int sum = 0;
		for (int ins : in)
			sum += Math.pow(ins, 2);

		System.out.println(sum % 10);
	}
}
