package q8958;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t, cor, sum;
		String[] in;

		t = Integer.parseInt(br.readLine());
		in = new String[t];

		for (int i = 0; i < t; i++)
			in[i] = br.readLine();
		br.close();

		for (int i = 0; i < t; i++) {
			cor = 0;
			sum = 0;
			for (int j = 0; j < in[i].length(); j++) {
				if (in[i].charAt(j) == 'O')
					sum += ++cor;
				else
					cor = 0;
			}
			bw.write(sum + "\n");
		}

		bw.flush();
		bw.close();
	}
}