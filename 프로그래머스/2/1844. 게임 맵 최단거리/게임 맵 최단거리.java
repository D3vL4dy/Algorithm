import java.util.LinkedList;
import java.util.Queue;

class Solution {
	static int n, m;
	static boolean[][] chk;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	int answer = -1;

	public int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;
		chk = new boolean[n][m];

		return bfs(0, 0, maps);
	}

	public int bfs(int x, int y, int[][] maps) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { x, y, 1 });
		chk[x][y] = true;

		while (!queue.isEmpty()) {
			int p[] = queue.poll();
			int px = p[0];
			int py = p[1];
			int cnt = p[2]; // 현재까지 이동 거리

			// 현재 탐색 중인 위치가 목표지점인지 확인
			if (px == n - 1 && py == m - 1) {
				answer = cnt;
				break;
			}

			for (int d = 0; d < 4; d++) {
				int nx = px + dx[d];
				int ny = py + dy[d];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}

				if (maps[nx][ny] == 1 && !chk[nx][ny]) {
					chk[nx][ny] = true;
					queue.add(new int[] { nx, ny, cnt + 1 });
				}
			}
		}

		return answer;
	}
}