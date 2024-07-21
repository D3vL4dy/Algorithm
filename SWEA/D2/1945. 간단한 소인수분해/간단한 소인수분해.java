import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(bReader.readLine());

		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(bReader.readLine());
			int[] result = new int[5];

			while (n != 1) {
				if (n % 2 == 0) {
					result[0]++;
					n = n / 2;
				} else if (n % 3 == 0) {
					result[1]++;
					n = n / 3;
				} else if (n % 5 == 0) {
					result[2]++;
					n = n / 5;
				} else if (n % 7 == 0) {
					result[3]++;
					n = n / 7;
				} else if (n % 11 == 0) {
					result[4]++;
					n = n / 11;
				}
			}
			
			System.out.print("#" + t + " ");
			for(int i = 0; i < 5; i ++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			
		}

	}

}