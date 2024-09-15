import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int curR = 0, curC = 0;
        boolean[][] passVertical = new boolean[N][N]; // 수직 이동 기록
        boolean[][] passHorizontal = new boolean[N][N]; // 수평 이동 기록

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'D') {
                if (curR == N - 1)
                    continue;
                passVertical[curR][curC] = passVertical[curR + 1][curC] = true;
                curR++;
            } else if (ch == 'U') {
                if (curR == 0)
                    continue;
                passVertical[curR][curC] = passVertical[curR - 1][curC] = true;
                curR--;
            } else if (ch == 'R') {
                if (curC == N - 1)
                    continue;
                passHorizontal[curR][curC] = passHorizontal[curR][curC + 1] = true;
                curC++;
            } else {
                if (curC == 0)
                    continue;
                passHorizontal[curR][curC] = passHorizontal[curR][curC - 1] = true;
                curC--;
            }
        }

        for (int i = 0; i < N; i++) {
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < N; j++) {
                if (passVertical[i][j] && passHorizontal[i][j])
                    ans.append("+");
                else if (passVertical[i][j])
                    ans.append("|");
                else if (passHorizontal[i][j])
                    ans.append("-");
                else
                    ans.append(".");
            }
            System.out.println(ans);
        }
    }
}