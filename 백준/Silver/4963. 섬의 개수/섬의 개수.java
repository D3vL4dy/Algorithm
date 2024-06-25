import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int w, h;
	static int[][] map;
	static boolean[][] check;
	static int dx[] = { 1, 0, -1, 0, 1, -1, -1, 1 }; // 상하좌우 + 대각선
	static int dy[] = { 0, 1, 0, -1, 1, 1, -1, -1 };
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0)
				break;

			map = new int[h][w];
			check = new boolean[h][w];
			cnt = 0;

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !check[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);

		}

	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y }); // 시작점을 큐에 추가
		check[x][y] = true; // 시작점 방문 표시

		while (!q.isEmpty()) {
			int[] p = q.poll(); // 큐에서 현재 위치를 가져옴
			int px = p[0];
			int py = p[1];

			for (int d = 0; d < 8; d++) {
				int nx = px + dx[d];
				int ny = py + dy[d];

				// 좌표의 범위, 방문 여부, 섬인지 확인
				if (nx < 0 || ny < 0 || nx >= h || ny >= w || check[nx][ny] || map[nx][ny] == 0)
					continue;

				if (!check[nx][ny] && map[nx][ny] == 1) {
					q.add(new int[] { nx, ny });
					check[nx][ny] = true;
				}
			}
		}

	}

}