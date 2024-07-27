import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int ans = 0;
			for (int i = 2; i < n - 2; i++) {
				int max = 0;
				int maxIdx = 0;
				for (int j = i - 2; j <= i + 2; j++) {
					if (arr[j] > max) {
						max = arr[j];
						maxIdx = j;
					}
				}

				if (arr[i] - arr[maxIdx] > 0) {
					ans += (arr[i] - arr[maxIdx]);
				} else if (arr[i] == arr[maxIdx]) {
					int max2 = Math.max(arr[i - 2], Math.max(arr[i - 1], Math.max(arr[i + 1], arr[i + 2])));
					ans += (arr[i] - max2);
				} else {
					continue;
				}
			}
			System.out.println("#" + t + " " + ans);

		}
	}

}