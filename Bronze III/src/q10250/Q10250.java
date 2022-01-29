package q10250;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in[][];

		in = new int[Integer.parseInt(br.readLine())][3];

		for (int i = 0; i < in.length; i++) {
			String[] tmp = br.readLine().split(" ");
			for (int j = 0; j < tmp.length; j++)
				in[i][j] = Integer.parseInt(tmp[j]);
		}
		br.close();

		for (int[] i : in) {
			int room = i[2] / i[0] + ((i[2] % i[0] != 0) ? 1 : 0);
			int floor = (i[2] % i[0] != 0) ? i[2] % i[0] : i[0];

			bw.write(floor + "" + ((room < 10) ? "0" + room : room) + "\n");
		}

		bw.flush();
		bw.close();
	}
}