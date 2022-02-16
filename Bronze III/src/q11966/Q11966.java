package q11966;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q11966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger n, tmp;
		int res = 0;

		n = new BigInteger(br.readLine());
		br.close();

		if (n.equals(BigInteger.ONE))
			res = 1;// 1인 경우 2의 제곱수이기에 따로 처리
		else if (n.remainder(BigInteger.TEN).remainder(BigInteger.TWO) == BigInteger.ONE)
			res = 0;// 일의 자리가 홀수인 수는 2의 제곱수가 아니기에 따로 처리
		else {
			tmp = BigInteger.ONE;
			while (n.compareTo(tmp) == 1) {// 1부터 2를 곱해가며 2의 제곱수인지 확인
				tmp = tmp.multiply(BigInteger.TWO);
				if (n.equals(tmp)) {
					res = 1;
					break;
				}
			}
		}
		bw.write(res + "");
		bw.flush();
		bw.close();
	}
}