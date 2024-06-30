import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			String str = br.readLine();
			char[] ch = str.toCharArray();
			String reverseStr = "";

			for (int i = ch.length - 1; i >= 0; i--) {
				reverseStr += ch[i];
			}

			int result = 1;
			if (!str.equals(reverseStr)) {
				result = 0;
			}

			System.out.println("#" + t + " " + result);
		}

	}

}