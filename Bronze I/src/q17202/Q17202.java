package q17202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q17202 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine(), B = br.readLine(), res, tmp;
		br.close();
		
		res = "";
		for (int i = 0; i < A.length(); i++) {
			res += A.charAt(i);
			res += B.charAt(i);
		}
		
		while (res.length() != 2) {
			tmp = "";
			for (int i = 0; i < res.length()-1; i++)
				tmp += (Character.getNumericValue(res.charAt(i)) + Character.getNumericValue(res.charAt(i+1))) % 10;
			res = tmp;
		} 
		bw.write(res);
		bw.flush();
		bw.close();
	}

}
