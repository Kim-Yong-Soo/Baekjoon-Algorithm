package q2869;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 시간 제한 맞추기가 관점인 문제
// 처음에는 while 반복문으로 풀었지만, 시간 제한에 걸려
// 길이 식을 변환하여 날짜를 구하도록 하였고,
// 만약 아닌 경우를 위해 조건문을 추가함.

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a, b, v, day;

		String tmp[] = br.readLine().split(" ");
		br.close();

		a = Integer.parseInt(tmp[0]);
		b = Integer.parseInt(tmp[1]);
		v = Integer.parseInt(tmp[2]);

		day = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0)
			day++;

		bw.write(day + "");
		bw.flush();
		bw.close();
	}
}