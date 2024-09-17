import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        // 1. Binary Search를 적용하기 위해 정렬한다.
        Arrays.sort(arr);

        int cnt = 0;
        while (M-- > 0) {
            String X = br.readLine();
            // 2. arr에 X가 있는지 확인한다.
            // 있다면 X의 인덱스 리턴 (0보다 크거나 같으면 존재한다는 것)
            if (Arrays.binarySearch(arr, X) >= 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}