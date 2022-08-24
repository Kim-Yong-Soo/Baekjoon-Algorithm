package q14489;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q14489 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp[] = br.readLine().split(" ");
		int a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]), price = Integer.parseInt(br.readLine());
		br.close();

		bw.write(((price * 2 > a + b) ? (a + b) : (a + b - price * 2)) + "");
		bw.flush();
		bw.close();
	}

}
