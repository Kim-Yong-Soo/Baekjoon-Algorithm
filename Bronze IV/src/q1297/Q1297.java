package q1297;

import java.util.Scanner;

public class Q1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, h, w;

		d = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();
		sc.close();

		double r = Math.sqrt(Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
		System.out.println((int) Math.floor(r * h) + " " + (int) Math.floor(r * w));
	}
}