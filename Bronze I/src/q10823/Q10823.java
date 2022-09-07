package q10823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10823 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in = "", all = "", strArr[];
		int sum = 0;

		while (true) {
			all += in;
			if ((in = br.readLine()) == null)
				break;
		}
		br.close();

		strArr = all.split(",");

		for (int i = 0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}
