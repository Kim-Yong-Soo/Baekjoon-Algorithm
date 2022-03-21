package q2506;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n, cont_num, sum;

		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();

		cont_num = 0;
		sum = 0;

		for (int i = 0; i < n; i++)
			if (st.nextToken().equals("1"))
				sum += ++cont_num;
			else
				cont_num = 0;

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}