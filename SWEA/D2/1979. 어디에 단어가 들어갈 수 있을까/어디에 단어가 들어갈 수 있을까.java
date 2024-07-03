import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int result = 0;

			for (int i = 0; i < n; i++) {
				int cnt = 0;

				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 1) {
						cnt++;
					} else {
						if (cnt == k) {
							result++;
						}
						cnt = 0;
					}
				}
				if (cnt == k) {
					result++;
				}
			}

			for (int i = 0; i < n; i++) {
				int cnt = 0;

				for (int j = 0; j < n; j++) {
					if (arr[j][i] == 1) {
						cnt++;
					} else {
						if (cnt == k) {
							result++;
						}
						cnt = 0;
					}

				}
				if (cnt == k) {
					result++;
				}
			}
			System.out.println("#" + t + " " + result);
		}

	}
}