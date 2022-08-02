package q10867;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Q10867 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String inp[] = br.readLine().split(" ");
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++)
			set.add(Integer.parseInt(inp[i]));
		
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		for (int l : list)
			bw.write(l + " ");
		
		bw.flush();
		bw.close();
	}

}
