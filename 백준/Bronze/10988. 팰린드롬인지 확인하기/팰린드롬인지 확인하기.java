import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String str = br.readLine();
        int len = str.length();
        int flag = 1;
        
		for (int i = 0; i < len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)){
                flag = 0;
                break;
            }
		}
        System.out.println(flag);
	}
}