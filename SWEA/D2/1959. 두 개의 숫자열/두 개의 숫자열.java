import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[] A = new int[n];
			int[] B = new int[m];

			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < m; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}

			int max = 0;

			if (n < m) {
				for (int i = 0; i < m - n + 1; i++) {
					int sum = 0;
					for (int j = 0; j < n; j++) {
						sum += A[j] * B[i + j];
					}
					if (sum > max) {
						max = sum;
					}
				}
			}

			if (n > m) {
				for (int i = 0; i < n - m + 1; i++) {
					int sum = 0;
					for (int j = 0; j < m; j++) {
						sum += A[i + j] * B[j];
					}
					if (sum > max) {
						max = sum;
					}
				}
			}

			if (n == m) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					sum += A[i] * B[i];
				}
				if (sum > max) {
					max = sum;
				}
			}
			System.out.println("#" + t + " " + max);

		}
	}

}