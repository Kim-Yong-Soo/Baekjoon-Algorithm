package q5543;

import java.util.Scanner;

public class Q5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] price = new int[5];

		for (int i = 0; i < price.length; i++)
			price[i] = sc.nextInt();
		sc.close();

		int ham_min = price[0];
		for (int i = 1; i < 3; i++)
			if (ham_min > price[i])
				ham_min = price[i];

		int drink_min = (price[3] < price[4]) ? price[3] : price[4];

		System.out.println(ham_min + drink_min - 50);
	}
}