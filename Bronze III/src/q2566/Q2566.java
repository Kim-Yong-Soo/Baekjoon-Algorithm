package q2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[][] = new int[9][9], max = 0, maxI = 0, maxJ = 0;

		for (int i = 0; i < 9; i++) {
			String inp[] = br.readLine().split(" ");
			for (int j = 0; j < 9; j++) {
				in[i][j] = Integer.parseInt(inp[j]);
				if (max < in[i][j]) {
					max = in[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}

		br.close();
		bw.write(max + "\n" + (maxI + 1) + " " + (maxJ + 1));
		bw.flush();
		bw.close();
	}

}
