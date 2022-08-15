package q10822;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(",");
		br.close();
		int res = 0;

		for (String in : inp)
			res += Integer.parseInt(in);

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
