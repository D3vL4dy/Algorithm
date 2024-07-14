import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			int cnt = 1;
			int dir = 0;
			int x = 0, y = 0;

			while (cnt <= n * n) {
				arr[x][y] = cnt;
				cnt++;

				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 0) {
					x = nx;
					y = ny;

				} else {
					dir = (dir + 1) % 4;
					x += dx[dir];
					y += dy[dir];
				}
			}

			System.out.println("#" + t);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
}