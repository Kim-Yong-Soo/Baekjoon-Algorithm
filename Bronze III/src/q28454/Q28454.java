package q28454;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q28454 {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date curDate = sdf.parse(br.readLine());
		int n = Integer.parseInt(br.readLine()), res = 0;

		for (int i = 0; i < n; i++) {
			Date gif = sdf.parse(br.readLine());
			if (!gif.before(curDate)) {
				res++;
			}
		}
		br.close();

		bw.write(res + "");
		bw.flush();
		bw.close();
	}

}
