package q10709;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10709 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		int h = Integer.parseInt(inp[0]), w = Integer.parseInt(inp[1]);

		for (int i = 0; i < h; i++) {
			String in = br.readLine();
			int back = -1;

			for (int j = 0; j < w; j++) {
				if (in.charAt(j) == 'c') {
					bw.write("0 ");
					back = w - 1;
				} else if (back == -1)
					bw.write("-1 ");
				else
					bw.write(w - back-- + " ");
			}

			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
