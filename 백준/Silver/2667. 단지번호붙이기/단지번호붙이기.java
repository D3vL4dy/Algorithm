import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	static int[][] map; // 아파트 단지의 지도 저장
	static boolean[][] check; // 방문 여부
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static List<Integer> result; // 각 단지에 속한 아파트 수 저장
	static int cnt; // 각 단지 내 아파트 수를 세는 변수
	static int n; // 아파트 단지의 크기 저장

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		result = new LinkedList<Integer>();
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		check = new boolean[n][n];
		cnt = 0; 

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!check[i][j] && map[i][j] == 1) {
					cnt = 0;
					dfs(i, j);
					result.add(cnt);
				}
			}
		}

		Collections.sort(result);

		bw.write(result.size() + "\n");
		for (int r : result)
			bw.write(r + "\n");
		bw.flush();
		bw.close();

	}

	private static void dfs(int x, int y) {
		check[x][y] = true; // 방문 여부 표시
		cnt++; // 현재 아파트 단지의 아파트 수 증가

		for (int d = 0; d < 4; d++) {
			int nx = dx[d] + x;
			int ny = dy[d] + y;

			// 새로운 좌표가 범위 내에 있고, 방문하지 않았으며, 아파트가 있는 경우
			if (nx >= 0 && ny >= 0 && nx < n && ny < n && !check[nx][ny] && map[nx][ny] == 1) {
				dfs(nx, ny);
			}
		}

	}
}
