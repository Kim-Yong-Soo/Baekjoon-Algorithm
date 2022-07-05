package q10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, v, cnt = 0, lst[];
		
		n = Integer.parseInt(br.readLine());
		lst = new int[n];
		for (String s : br.readLine().split(" "))
			lst[cnt++] = Integer.parseInt(s);
		
		v = Integer.parseInt(br.readLine());
		br.close();
		cnt = 0;
		for (int i : lst)
			if (i == v)
				cnt++;
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}

}
