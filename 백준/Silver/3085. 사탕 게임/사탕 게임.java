import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void swap(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }

    private static int maxRow(char[][] map) {
        int n = map.length;
        int maxRow = 0;
        for (int r = 0; r < n; r++) {
            int len = 1; // 연속되는 캔디의 수
            for (int c = 1; c < n; c++) {
                if (map[r][c] == map[r][c - 1]) {
                    len++;
                } else {
                    maxRow = Math.max(maxRow, len);
                    len = 1;
                }
            }
            maxRow = Math.max(maxRow, len);
        }
        return maxRow;
    }

    private static int maxCol(char[][] map) {
        int n = map.length;
        int maxCol = 0;
        for (int c = 0; c < n; c++) {
            int len = 1; // 연속되는 캔디의 수
            for (int r = 1; r < n; r++) {
                if (map[r][c] == map[r - 1][c]) {
                    len++;
                } else {
                    maxCol = Math.max(maxCol, len);
                    len = 1;
                }
            }
            maxCol = Math.max(maxCol, len);
        }
        return maxCol;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N && map[i][j] != map[i][j + 1]) {
                    swap(map, i, j, i, j + 1);
                    ans = Math.max(ans, Math.max(maxCol(map), maxRow(map)));
                    swap(map, i, j, i, j + 1);
                }
                if (i + 1 < N && map[i][j] != map[i + 1][j]) {
                    swap(map, i, j, i + 1, j);
                    ans = Math.max(ans, Math.max(maxCol(map), maxRow(map)));
                    swap(map, i, j, i + 1, j);
                }
            }
        }
        System.out.println(ans);

    }

}