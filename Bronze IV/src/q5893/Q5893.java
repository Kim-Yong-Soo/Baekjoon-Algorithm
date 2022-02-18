package q5893;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q5893 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger sumB, a;
		String n, tmp = "";

		n = br.readLine();
		br.close();

		sumB = new BigInteger(n);
		a = BigInteger.ZERO;

		BigInteger cnt = BigInteger.valueOf(1);
		for (int i = 0; i < n.length(); i++) {
			BigInteger tmpBI = sumB.mod(BigInteger.valueOf(10));
			a = a.add(tmpBI.multiply(cnt));
			sumB = sumB.divide(BigInteger.valueOf(10));
			cnt = cnt.multiply(BigInteger.TWO);
		}

		sumB = a.multiply(BigInteger.valueOf(17));
		while (!sumB.equals(BigInteger.ONE)) {
			tmp += sumB.remainder(BigInteger.TWO);
			sumB = sumB.divide(BigInteger.TWO);
		}
		tmp += sumB;

		for (int i = tmp.length() - 1; i >= 0; i--)
			bw.write(tmp.charAt(i));
		bw.write("\n");
		bw.flush();
		bw.close();
	}
}