package q15781;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q15781 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String tmpNM[] = br.readLine().split(" "), tmpHM[] = br.readLine().split(" "),
				tmpVS[] = br.readLine().split(" ");
		br.close();

		int n = Integer.parseInt(tmpNM[0]), m = Integer.parseInt(tmpNM[1]), helmet[] = new int[n], vest[] = new int[m];

		for (int i = 0; i < n; i++) {
			helmet[i] = Integer.parseInt(tmpHM[i]);
		}
		for (int i = 0; i < m; i++) {
			vest[i] = Integer.parseInt(tmpVS[i]);
		}

		Arrays.sort(helmet);
		Arrays.sort(vest);

		bw.write(helmet[n - 1] + vest[m - 1] + "");
		bw.flush();
		bw.close();

	}

}
