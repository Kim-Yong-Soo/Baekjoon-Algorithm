package q25083;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q25083 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("         ,r'\"7\nr`-_   ,'  ,/\n \\. \". L_r'\n   `~\\/\n      |\n      |");
		bw.flush();
		bw.close();
	}

}
