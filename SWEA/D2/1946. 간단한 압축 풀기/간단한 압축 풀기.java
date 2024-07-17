import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(bReader.readLine());
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(bReader.readLine());
			String[] str = new String[n];
			int[] num = new int[n];
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(bReader.readLine(), " ");
				str[i] = st.nextToken();
				num[i] = Integer.parseInt(st.nextToken());
			}
            
			System.out.println("#" + t);
            
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < num[i]; j++) {
					System.out.print(str[i]);
					cnt++;
                    
					if (cnt >= 10) {
						System.out.println();
						cnt = 0;
					}
				}
			}
			System.out.println();
		}

	}

}