import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String str = "";

		for (int t = 1; t <= tc; t++) {
			str = br.readLine();
			int[] arr = new int[str.length()];
			int[] start = new int[str.length()];

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i) - '0';
				start[i] = 0;
			}

			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (start[i] != arr[i]) {
					for (int j = 0; j < arr.length; j++) {
						start[j] = arr[i];
					}
					cnt++;
				}
			}

			System.out.println("#" + t + " " + cnt);

		}
	}

}
