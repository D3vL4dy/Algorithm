import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr = new int[100][100];

		for (int t = 1; t <= 10; t++) {
			br.readLine();

			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int maxSum = 1;
			int leftCrossSum = 0, rightCrossSum = 0;
			for (int i = 0; i < 100; i++) {
				int rowSum = 0;
				int colSum = 0;
				for (int j = 0; j < 100; j++) {
					rowSum += arr[i][j];
					colSum += arr[j][i];
				}
				maxSum = Math.max(maxSum, Math.max(rowSum, colSum));
				
				leftCrossSum += arr[i][i];
				rightCrossSum += arr[i][99 - i];

				maxSum = Math.max(maxSum, Math.max(leftCrossSum, rightCrossSum));
			}
			System.out.println("#" + t + " " + maxSum);
		}

	}

}