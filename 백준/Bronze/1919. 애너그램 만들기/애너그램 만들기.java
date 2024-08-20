import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[] getCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String a = bReader.readLine();
		String b = bReader.readLine();

		int[] cntA = getCount(a);
		int[] cntB = getCount(b);

		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += Math.abs(cntA[i] - cntB[i]);
		}

		System.out.println(ans);

	}

}