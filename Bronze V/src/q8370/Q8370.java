package q8370;

import java.util.*;

public class Q8370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seatsInfo = new int[4];

		for (int i = 0; i < seatsInfo.length; i++)
			seatsInfo[i] = sc.nextInt();
		sc.close();

		int allSeats = 0;
		for (int j = 0; j < seatsInfo.length; j += 2)
			allSeats += seatsInfo[j] * seatsInfo[j + 1];

		System.out.println(allSeats);
	}
}