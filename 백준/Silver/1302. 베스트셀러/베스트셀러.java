import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] titles = new String[N];
        for (int i = 0; i < N; i++) {
            titles[i] = br.readLine();
        }

        Arrays.sort(titles); // 사전순 비교를 위한 compareTo 메서드가 자동으로 호출됨

        String maxTitle = titles[0]; // 가장 많이 팔린 책 제목
        int maxCount = 1; // 그 책이 팔린 횟수
        int currentCount = 1; // 현재 비교 중인 책 제목이 몇 번 나왔는지 저장
        for (int i = 1; i < N; i++) {
            if (!titles[i].equals(titles[i - 1])) {
                currentCount = 0;
            }
            currentCount++;

            if (currentCount > maxCount || (currentCount == maxCount && titles[i].compareTo(maxTitle) < 0)) {
                maxTitle = titles[i];
                maxCount = currentCount;
            }
        }
        System.out.println(maxTitle);
    }
}