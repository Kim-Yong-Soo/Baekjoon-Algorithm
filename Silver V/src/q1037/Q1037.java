package q1037;

import java.util.Scanner;

class Calc {
	public int min_max(int type, int[] ns) {
		// type 0: min, 1: max
		int min_max = 0;
		if (type == 0) {
			min_max = ns[0];
			for (int i : ns) {
				if (i < min_max)
					min_max = i;
			}
		} else if (type == 1) {
			min_max = ns[0];
			for (int i : ns) {
				if (i > min_max)
					min_max = i;
			}
		}
		return min_max;
	}
}

public class Q1037 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		int n;
		int ns[];

		n = sc.nextInt();
		ns = new int[n];

		for (int i = 0; i < ns.length; i++)
			ns[i] = sc.nextInt();
		sc.close();

		if (ns.length == 0 && ns[0] == 2)
			System.out.println(ns[0] * ns[0]);
		else
			System.out.println(calc.min_max(0, ns) * calc.min_max(1, ns));
	}
}