package q18301;

import java.util.*;

public class Q18301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n12;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n12 = sc.nextInt();
		sc.close();
		
		System.out.println((int)((n1+1)*(n2+1)/(n12+1)-1));
	}
}