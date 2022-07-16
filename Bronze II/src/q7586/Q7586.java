package q7586;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Q7586 {

	public static int getPoints(String probCode) {
		int point = 0;
		if (probCode.equals("L"))
			point = 120;
		else if (probCode.equals("S") || probCode.equals("B"))
			point = 150;
		else if (probCode.equals("N"))
			point = 40;
		else if (probCode.equals("C"))
			point = 160;
		else if (probCode.equals("D") || probCode.equals("R") || probCode.equals("O"))
			point = 100;
		return point;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String airplaneName, seat[];
		Map<String, Integer> map;
		int cnt;

		while (!(airplaneName = br.readLine()).equals("#")) {
			map = new HashMap<>();
			while (!(seat = br.readLine().split(" "))[0].equals("00A")) {
				if (!map.isEmpty() && map.containsKey(seat[0]))
					map.replace(seat[0], map.get(seat[0]) + getPoints(seat[1]));
				else
					map.put(seat[0], getPoints(seat[1]));
			}
			cnt = 0;
			for (int point : map.values())
				if (point >= 200)
					cnt++;
			bw.write(airplaneName + " " + cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
