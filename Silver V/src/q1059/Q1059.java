package q1059;

//Case 1
import java.util.Scanner;

//Case 2
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

//Both
import java.util.Arrays;

public class Q1059 {
	public static void main(String[] args) throws Exception { // throws Exception -> Case 2
		// Case 1 - Mem: 17872 KB, Time: 224 ms
		Scanner sc = new Scanner(System.in);
		int l, n, min = 0, max = 0, cnt = 0, doub = 0;
		int[] s;

		l = sc.nextInt();
		s = new int[l + 1];
		for (int i = 0; i < s.length - 1; i++)
			s[i] = sc.nextInt();
		n = sc.nextInt();
		sc.close();

		s[s.length - 1] = n;
		Arrays.sort(s);

		for (int i = 0; i < s.length; i++) {
			if (s[i] == n) {
				min = (i <= 0) ? 0 : s[i - 1];
				max = (i >= s.length - 1) ? n : s[i + 1];
				doub = (s[i + 1] == n) ? 1 : 0;
				break;
			}
		}

		if (doub != 1)
			cnt = (n - min) * (max - n) - 1;
		System.out.println(cnt);

		// Case 2 - Mem: 15984 KB, Time: 140 ms
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int l, n, min = 0, max = 0, cnt = 0, doub = 0;
//		String[] temp;
//		int[] s;
//
//		l = Integer.parseInt(br.readLine());
//		s = new int[l + 1];
//		temp = br.readLine().split(" ");
//		for (int i = 0; i < s.length - 1; i++)
//			s[i] = Integer.parseInt(temp[i]);
//		n = Integer.parseInt(br.readLine());
//
//		s[s.length - 1] = n;
//		Arrays.sort(s);
//
//		for (int i = 0; i < s.length; i++) {
//			if (s[i] == n) {
//				min = (i <= 0) ? 0 : s[i - 1];
//				max = (i >= s.length - 1) ? n : s[i + 1];
//				doub = (s[i + 1] == n) ? 1 : 0;
//				break;
//			}
//		}
//
//		if (doub != 1)
//			cnt = (n - min) * (max - n) - 1;
//		bw.write(cnt + "\n");
//		bw.flush();
//		bw.close();
	}
}