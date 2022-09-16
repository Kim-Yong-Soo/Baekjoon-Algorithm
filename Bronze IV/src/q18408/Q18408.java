package q18408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q18408 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		br.close();

		int cnt = 0; // 1의 개수
		for (int i = 0; i < inp.length; i++)
			if (inp[i].equals("1"))
				cnt++;

		bw.write(((cnt >= 2) ? "1" : "2"));
		bw.flush();
		bw.close();
	}

}
