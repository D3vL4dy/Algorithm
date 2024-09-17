import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(st.nextToken());
            map.put(X, map.getOrDefault(X, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (M-- > 0) {
            int X = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(X, 0)).append(' '); // X라는 키에 해당하는 값을 가져오고 없으면 0을 반환
        }
        System.out.println(sb);
    }
}
