import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			int[][] arr = new int[9][9];
			
			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int res = 1;
			
			for (int i = 0; i < 9; i++) {
				int sum = 0;
				for (int j = 0; j < 9; j++) {
					sum += arr[i][j];
				}

				if (sum != 45) {
					res = 0;
					break;
				}
			}

			for (int i = 0; i < 9; i++) {
				int sum = 0;
				for (int j = 0; j < 9; j++) {
					sum += arr[j][i];
				}

				if (sum != 45) {
					res = 0;
					break;
				}
			}

			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					int sum = 0;

					for (int k = i; k < i + 3; k++) {
						for (int l = j; l < j + 3; l++) {
							sum += arr[k][l];
						}
					}

					if (sum != 45) {
						res = 0;
						break;
					}
				}
			}
			System.out.println("#" + t + " " + res);

		}

	}

}