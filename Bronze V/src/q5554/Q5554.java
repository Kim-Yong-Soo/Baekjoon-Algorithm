package q5554;

import java.util.*;

public class Q5554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			int tem = sc.nextInt();
			sum += tem;
		}
		sc.close();

		System.out.println(sum / 60 + "\n" + sum % 60);
	}
}