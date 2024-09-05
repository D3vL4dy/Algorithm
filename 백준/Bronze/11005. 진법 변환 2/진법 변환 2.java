import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 10진수
        int B = Integer.parseInt(st.nextToken()); // 변환할 진법

        // 1. N을 B로 나눈 나머지를 구하고, B로 나눈다.
        // 2. 이때 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
        String ans = "";
        while (N > 0) {
            int D = N % B;
            if (D < 10)
                ans += D;
            else
                ans += (char) (D - 10 + 'A'); // 10부터 시작하는 숫자를 문자 'A'부터 대응
            N = N / B;
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            System.out.print(ans.charAt(i));
        }

    }
}