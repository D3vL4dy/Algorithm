import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < n; i++) {
            exist[arr[i]] = true; // 해당 숫자가 배열에 존재함을 의미
        }

        int ans = 0;
        for (int i = 1; i <= (X - 1) / 2; i++) {
            if (i <= 1000000 && X - i <= 1000000) { // 배열의 범위 내에 있는지 확인하여 런타임 에러 방지
                ans += (exist[i] && exist[X - i]) ? 1 : 0;
            }
        }
        System.out.println(ans);
    }
}