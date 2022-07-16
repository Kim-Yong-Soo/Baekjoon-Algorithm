package q5608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Q5608 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		Map<String, String> map = new HashMap<>();
		
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String inp[] = br.readLine().split(" ");
			map.put(inp[0], inp[1]);
		}
		
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String inp = br.readLine();
			if (!map.isEmpty() && map.containsKey(inp))
				inp = map.get(inp);
			bw.write(inp);
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
