package q10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

class Member {
	private int num, age;
	private String name;

	public Member(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name;
	}

	public int getNum() {
		return this.num;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}
}

public class Q10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		List<Member> members = new ArrayList<>();

		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String tmp[] = br.readLine().split(" ");
			members.add(new Member(i, Integer.parseInt(tmp[0]), tmp[1]));
		}
		br.close();

		Collections.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});

		for (Member m : members)
			bw.write(m.getAge() + " " + m.getName() + "\n");
		bw.flush();
		bw.close();
	}
}