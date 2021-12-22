package q1011;

import java.util.*;

public class Q1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;

		t = sc.nextInt();
		int[] xy = new int[2 * t];
		int[] res = new int[t];

		for (int i = 1; i < xy.length; i += 2) {
			xy[i - 1] = sc.nextInt();
			xy[i] = sc.nextInt();
		}
		sc.close();

		int a = 0;
		for (int j = 0; j < xy.length; j += 2) {
			int dis = xy[j + 1] - xy[j];
			int k = (int) Math.sqrt(dis);
			int mov;
			if (Math.pow(k, 2) == dis) {
				mov = 2 * k - 1;
			} else {
				mov = 2 * k;
			}

			if (dis > k * (k + 1))
				mov += 1;

			res[a++] = mov;
		}

		for (int r : res)
			System.out.println(r);
	}
}