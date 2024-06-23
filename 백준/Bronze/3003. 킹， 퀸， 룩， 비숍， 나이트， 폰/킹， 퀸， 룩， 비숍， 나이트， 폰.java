import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int res[] = new int[6];
        int chs[] ={1, 1, 2, 2, 2, 8}; 
        
		for (int i = 0; i < chs.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            res[i] = chs[i] - n;
		}
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }  
	}
}