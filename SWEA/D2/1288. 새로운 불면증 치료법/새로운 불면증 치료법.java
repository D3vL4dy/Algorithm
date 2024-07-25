import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			String s = br.readLine();
			int n = Integer.parseInt(s);

			boolean check[] = new boolean[10];

			int num = 1;
			int cnt = 0;

			while (true) {
				for (int i = 0; i < s.length(); i++) {
					int temp = s.charAt(i) - '0';
					if (check[temp] == false) {
						check[temp] = true;
						cnt++;
					}
				}

				if (cnt == 10) {
					break;
				} else {
					num++;
					s = Integer.toString(num * n);
				}
			}
			System.out.println("#" + t + " " + s);
		}
	}

}