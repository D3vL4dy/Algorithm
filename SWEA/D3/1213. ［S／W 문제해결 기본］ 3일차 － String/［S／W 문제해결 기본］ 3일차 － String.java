import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			br.readLine();
			String find = br.readLine();
			String text = br.readLine();

			int cnt = 0;
			int idx = 0;

			while (text.contains(find)) {
				idx = text.indexOf(find);
				text = text.substring(idx + find.length());
				cnt++;
			}

			System.out.println("#" + t + " " + cnt);
		}
	}

}