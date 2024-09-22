import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < T - i; j++) {
                sb.append("*");
            }
            sb.append("\n");

        }

        System.out.println(sb);

    }
}
