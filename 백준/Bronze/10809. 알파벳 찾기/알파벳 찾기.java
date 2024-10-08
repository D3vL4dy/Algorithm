import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }

    }
}