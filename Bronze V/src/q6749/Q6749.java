package q6749;

import java.util.*;

public class Q6749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int young, middle;

		young = sc.nextInt();
		middle = sc.nextInt();
		sc.close();

		System.out.println(middle + (middle - young));
	}
}