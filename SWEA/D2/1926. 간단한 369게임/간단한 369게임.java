import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			String num = Integer.toString(i);
			String res = "";

			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					res += "-";
				}
			}

			if (res.length() >= 1) {
				bw.write(res + " ");
			} else {
				bw.write(num + " ");
			}

		}
		bw.flush();
		bw.close();

	}

}