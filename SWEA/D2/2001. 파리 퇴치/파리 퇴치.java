import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int max = 0;

			for (int si = 0; si < n - m + 1; si++) {
				for (int sj = 0; sj < n - m + 1; sj++) {
					int cnt = 0;

					for (int i = si; i < si + m; i++) {
						for (int j = sj; j < sj + m; j++) {
							cnt += arr[i][j];
						}
					}

					if (cnt > max) {
						max = cnt;
					}
				}
			}

			System.out.println("#" + t + " " + max);
		}

	}
}