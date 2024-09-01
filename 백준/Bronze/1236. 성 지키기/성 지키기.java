import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] rowChk = new boolean[N];
        boolean[] colChk = new boolean[M];

        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    rowChk[i] = true; // 행 체크
                    colChk[j] = true; // 열 체크
                }
            }
        }

        int rowCnt = 0;
        for (int i = 0; i < N; i++) {
            if (!rowChk[i]) {
                rowCnt++;
            }
        }

        int colCnt = 0;
        for (int i = 0; i < M; i++) {
            if (!colChk[i]) {
                colCnt++;
            }
        }

        System.out.println(Math.max(rowCnt, colCnt));

    }
}