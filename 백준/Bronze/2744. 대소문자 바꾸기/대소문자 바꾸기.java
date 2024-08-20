import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String string = bReader.readLine();
		String ans = "";

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			if ('A' <= ch && ch <= 'Z') {
				ans += (char) ('a' + ch - 'A'); // 차이 더하기
			} else {
				ans += (char) ('A' + ch - 'a');
			}
		}

		System.out.println(ans);

	}

}