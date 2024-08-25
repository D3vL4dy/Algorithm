import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine();
        String word = br.readLine();

        String replaced = doc.replace(word, "");
        int len = doc.length() - replaced.length();
        int cnt = len / word.length();

        System.out.println(cnt);
    }
}