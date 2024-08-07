import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int cnt = n * n;
		int dir = 0;
		int x = 0, y = 0;

		while (cnt > 0) {
			arr[x][y] = cnt;
			cnt -= 1;

			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0) {
				dir = (dir + 1) % 4;
				nx = x + dx[dir];
				ny = y + dy[dir];
			}
			x = nx;
			y = ny;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}

		int num = Integer.parseInt(br.readLine());
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == num) {
					sb.append((i + 1) + " " + (j + 1));
					flag = true;
					break;
				}
			}

			if (flag)
				break;
		}

		System.out.println(sb);
	}

}