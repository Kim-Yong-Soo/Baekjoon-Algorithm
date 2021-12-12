package q2914;

import java.util.*;

public class Q2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int albumSong, avg;

		albumSong = sc.nextInt();
		avg = sc.nextInt();
		sc.close();

		System.out.println(albumSong * (avg - 1) + 1);
	}
}