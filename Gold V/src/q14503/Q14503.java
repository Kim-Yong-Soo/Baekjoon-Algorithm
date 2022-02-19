package q14503;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 조건을 적절하게 적용하는 것에 대해 고민을 계속한 문제
// 그래도 인터넷에서 코드 복붙 없이 풀어 만족함.
// process 함수에서 4번 반복하는 반복문을 실제로 로봇 청소기가 도는 것이 아니라 i로 확인을 하려고 욕심을 낸 점이 큰 오류
// 그렇게 문제 푸는데 1주일 정도 걸려서 다음부터는 더욱 크게 바라보기로 함.

class Robot {
	private int n, m, cur[], ing[][], cnt;

	int dx[] = new int[] { 0, -1, 0, 1 };
	int dy[] = new int[] { -1, 0, 1, 0 };

	public Robot() {
		cur = new int[3];
		try {
			in();
		} catch (IOException e) {
			n = 0;
			m = 0;
			cur = new int[] { 0, 0, 0 };
		}
	}

	public void in() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp[];

		tmp = br.readLine().split(" ");
		this.n = Integer.parseInt(tmp[0]);
		this.m = Integer.parseInt(tmp[1]);
		this.ing = new int[n][m];

		tmp = br.readLine().split(" ");
		for (int i = 0; i < 3; i++)
			cur[i] = Integer.parseInt(tmp[i]);

		for (int i = 0; i < this.n; i++) {
			tmp = br.readLine().split(" ");
			for (int j = 0; j < this.m; j++)
				this.ing[i][j] = Integer.parseInt(tmp[j]);
		}
	}

	public int process() {
		cnt = 1;
		ing[cur[0]][cur[1]] = 2;

		while (true) {
			boolean res = false;
			for (int i = 0; i < 4; i++) {
				int ck = check(0);

				turn();
				if (ck == 0) {
					move(1);
					break;
				}

				if (i == 3) {
					if (check(3) == 1)
						res = true;
					else
						move(0);
				}
			}

			if (ing[cur[0]][cur[1]] == 0) {
				ing[cur[0]][cur[1]] = 2;
				cnt++;
				// printMap();
				// System.out.println();
			}

			if (res)
				break;
		}
		return cnt;
	}

	private int check(int dir) {
		return ing[cur[0] + dx[(cur[2] + dir > 3) ? cur[2] + dir - 4 : cur[2] + dir]][cur[1]
				+ dy[(cur[2] + dir > 3) ? cur[2] + dir - 4 : cur[2] + dir]];
	}

	private void turn() {
		// 북쪽 0 -> [original][original-1]
		// 동쪽 1 -> [original-1][original]
		// 남쪽 2 -> [original][original+1]
		// 서쪽 3 -> [original+1][original]
		// 왼쪽으로 회전
		if (cur[2] == 0)
			cur[2] = 3;
		else
			cur[2]--;
	}

	private void move(int dir) {
		// dir (방향) -> 0: 후진, 1: 전진
		// 전진
		// 북쪽 0 -> [original-1][original]
		// 동쪽 1 -> [original][original+1]
		// 남쪽 2 -> [original+1][original]
		// 서쪽 3 -> [original][original-1]

		// 후진
		// 북쪽 0 -> [original+1][original]
		// 동쪽 1 -> [original][original-1]
		// 남쪽 2 -> [original-1][original]
		// 서쪽 3 -> [original][original+1]

		if (cur[2] == 0)
			cur[0] += (dir == 1) ? -1 : 1;
		else if (cur[2] == 1)
			cur[1] += (dir == 1) ? 1 : -1;
		else if (cur[2] == 2)
			cur[0] += (dir == 1) ? 1 : -1;
		else if (cur[2] == 3)
			cur[1] += (dir == 1) ? -1 : 1;
	}

//	private void printMap() {
//		for (int[] i : ing) {
//			for (int j : i)
//				System.out.print(j + " ");
//			System.out.println();
//		}
//	}
}

public class Q14503 {
	public static void main(String[] args) throws IOException {
		Robot robot = new Robot();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(robot.process() + "");
		bw.flush();
		bw.close();
	}
}