import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        // 1. K보다 작은 삼각수를 모두 구한다.
        int[] triangleNumbers = new int[50]; // 삼각수를 담을 배열
        int triangleNumberCount = 0;
        for (int i = 1;; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber >= 1000)
                break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }

        // 2. 구해진 삼각수 세 개의 합으로 K를 나타낼 수 있는지 확인한다.
        boolean[] isSumOfTriangleNumber = new boolean[1000];
        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if (sum < 1000)
                    isSumOfTriangleNumber[sum] = true;
            }
        }

        for (int i = 0; i < 1000; i++) {
            if (!isSumOfTriangleNumber[i])
                continue;

            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if (sum <= 1000)
                    isEurekaNumber[sum] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // [3, 1000]
        // isEurekaNumber[]
        preprocess();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }
}