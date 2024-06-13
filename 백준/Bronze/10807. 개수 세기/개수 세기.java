import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bReader.readLine());
		int[] arr = new int[n];
		
		StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());
		
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int num = Integer.parseInt(bReader.readLine());
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                cnt++;
            }
        }

        System.out.println(cnt);
	}

}