import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // A + B + C = X -> A + B = X - C
        // 1. A + B의 집합을 만든다.
        int[] sums = new int[N * (N + 1) / 2]; // 1에서 N까지의 합
        int sumsIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) { // 중복을 방지하기 위해 j=i부터 시작
                sums[sumsIndex++] = arr[i] + arr[j];
            }
        }

        Arrays.sort(sums);
        // 2. 모든 X - C에 대해 A + B 집합에 존재하는지 확인한다.
        int ans = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { // a[0] - a[1] != a[1] - a[0] : 차는 값이 다르기 때문에 j=0부터 시작
                int target = arr[i] - arr[j];
                if (Arrays.binarySearch(sums, target) >= 0) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }

        // 3. A + B = X - C 을 만족하는 X 중 최댓값을 출력한다.
        System.out.println(ans);

    }
}