package q1076;

import java.util.Scanner;
import java.math.BigInteger;

public class Q1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] colors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String[] input = new String[3];
		String resStr = "";
		int last = 0;
		BigInteger res;

		for (int i = 0; i < input.length; i++)
			input[i] = sc.next();
		sc.close();

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				if (i < 2 && colors[j].equals(input[i]))
					resStr += j;
				else if (i == 2 && colors[j].equals(input[i]))
					last = j;
			}
		}

		res = BigInteger.valueOf((long) (Integer.parseInt(resStr) * ((last != 0) ? Math.pow(10, last) : 1)));

		System.out.println(res);
	}
}