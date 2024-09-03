import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				String str = br.readLine();
				for (int j = 0; j < n; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}

			int ans = 0;
			int start = n / 2;
			int end = n / 2;

			for (int i = 0; i < n; i++) {
				for (int j = start; j <= end; j++) {
					ans += arr[i][j];
				}
				if (i < n / 2) { // 중간 행보다 위일 경우 start를 왼쪽, end를 오른쪽으로 이동
					start -= 1;
					end += 1;
				} else { // 중간 행보다 아래일 경우 start를 오른쪽, end를 왼쪽으로 이동
					start += 1;
					end -= 1;
				}
			}
			System.out.println("#" + t + " " + ans);

		}
	}

}