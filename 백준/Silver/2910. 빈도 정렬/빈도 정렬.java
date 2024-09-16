import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();

        // 각 숫자와 빈도수 map에 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // map의 key값을 꺼내 list에 저장
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> map.get(o2) - map.get(o1));

        for (int key : list) {
            for (int i = 0; i < map.get(key); i++) {
                bw.write(key + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}