import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[] result = new int[8];

			for (int i = 0; i < 8; i++) {
				result[i] = n / money[i];
				n = n - (money[i] * result[i]);
			}

			System.out.println("#" + t);

			for (int i = 0; i < 8; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}

}