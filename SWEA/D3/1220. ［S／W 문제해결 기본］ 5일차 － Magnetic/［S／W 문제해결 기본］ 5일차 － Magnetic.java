import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];

			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int cnt = 0;

			for (int i = 0; i < 100; i++) {
				int prev = 0; // 직전 자성체
				for (int j = 0; j < 100; j++) {
					if (arr[j][i] != 0) {
						if (arr[j][i] == 2 && prev == 1) {
							cnt++;
						}
						prev = arr[j][i];
					}
				}
			}

			System.out.println("#" + t + " " + cnt);
		}

	}
}
