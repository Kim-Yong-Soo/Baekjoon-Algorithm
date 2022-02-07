package q4101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String tmp[] = br.readLine().split(" ");

			if (Integer.parseInt(tmp[0]) == 0 && Integer.parseInt(tmp[1]) == 0)
				break;

			if (Integer.parseInt(tmp[0]) > Integer.parseInt(tmp[1]))
				bw.write("Yes\n");
			else
				bw.write("No\n");
		}

		bw.flush();
		bw.close();
	}
}