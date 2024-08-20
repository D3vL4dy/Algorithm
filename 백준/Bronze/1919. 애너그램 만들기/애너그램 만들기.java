import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String a = bReader.readLine();
		String b = bReader.readLine();

		int[] cntA = new int[26];
		int[] cntB = new int[26];

		for (int i = 0; i < a.length(); i++) {
			cntA[a.charAt(i) - 'a']++;
		}
		for (int i = 0; i < b.length(); i++) {
			cntB[b.charAt(i) - 'a']++;
		}
		
		int ans = 0;
		for(int i = 0; i < 26; i++) {
			ans += Math.abs(cntA[i] - cntB[i]);
		}
		
		System.out.println(ans);

	}

}