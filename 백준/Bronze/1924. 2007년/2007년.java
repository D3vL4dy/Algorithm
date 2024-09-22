import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int res = 0;
        for (int i = 0; i < m; i++) {
            res += months[i];
        }

        res += d;
        sb.append(days[res % 7]);

        System.out.println(sb);

    }
}
