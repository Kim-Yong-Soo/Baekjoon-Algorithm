package q10886;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, cute;

		n = Integer.parseInt(br.readLine());
		cute = 0;

		for (int i = 0; i < n; i++)
			if (br.readLine().equals("1"))
				cute++;
		br.close();

		bw.write((cute > n - cute) ? "Junhee is cute!" : "Junhee is not cute!");
		bw.flush();
		bw.close();
	}

}