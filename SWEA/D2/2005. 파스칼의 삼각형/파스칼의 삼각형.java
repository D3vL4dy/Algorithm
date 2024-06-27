import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j || j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
			    for (int j = 0; j <= i; j++) {
			        sb.append(arr[i][j] + " ");
			    }
			    sb.append("\n");
			}
			System.out.println("#" + t);
			System.out.print(sb);
		}

	}

}