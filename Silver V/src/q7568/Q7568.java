package q7568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class PersonalData {
	private int weight, height, rank;

	public PersonalData(int weight, int height) {
		this.weight = weight;
		this.height = height;
		this.rank = 1;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getHeight() {
		return this.height;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return this.rank;
	}
}

public class Q7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		PersonalData pd[];
		int n;

		n = Integer.parseInt(br.readLine());
		pd = new PersonalData[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			pd[i] = new PersonalData(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		br.close();

		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (pd[i].getWeight() < pd[j].getWeight() && pd[i].getHeight() < pd[j].getHeight())
					rank++;
			}
			pd[i].setRank(rank);
		}

		for (PersonalData p : pd)
			bw.write(p.getRank() + " ");
		bw.flush();
		bw.close();
	}
}