package q2744;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input, output;

		input = br.readLine();
		br.close();
		output = "";

		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i);
			if (65 <= index && index <= 90)
				output += (char) (index + 32);
			else if (97 <= index && index <= 122)
				output += (char) (index - 32);
		}
		bw.write(output);
		bw.flush();
		bw.close();
	}

}