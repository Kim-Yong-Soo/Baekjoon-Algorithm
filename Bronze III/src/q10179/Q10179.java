package q10179;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10179 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;

		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++)
			bw.write(String.format("$%.2f\n", Double.parseDouble(br.readLine()) * 0.8));
		br.close();
		bw.flush();
		bw.close();
	}

}