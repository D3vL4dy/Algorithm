import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine();
        String word = br.readLine();

        int cnt = 0;
        int startIdx = 0;

        while (true) {
            int findIdx = doc.indexOf(word, startIdx);
            if (findIdx < 0) {
                break;
            }

            cnt++;
            startIdx = findIdx + word.length();
        }

        System.out.println(cnt);
    }
}