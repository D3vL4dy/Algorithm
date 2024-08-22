import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[] getCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'A']++;
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String string = bReader.readLine().toUpperCase();
		int[] cnt = getCount(string);
		int maxCnt = -1;
		char maxAlphabet = '?';

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > maxCnt) {
				maxCnt = cnt[i];
				maxAlphabet = (char) ('A' + i);
			} else if (cnt[i] == maxCnt) {
				maxAlphabet = '?';
			}
		}

		System.out.println(maxAlphabet);

	}

}