import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[100];

		for (int t = 1; t <= 10; t++) {
			int dump = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < 100; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);

			int ans = 0;
			for (int i = 1; i <= dump; i++) {
				Arrays.sort(arr);
				if (arr[99] - arr[0] == 0 || arr[99] - arr[0] == 1) {
					break;
				} else {
					arr[0] += 1;
					arr[99] -= 1;
				}
			}
			Arrays.sort(arr);
			ans = arr[99] - arr[0];

			System.out.println("#" + t + " " + ans);
		}
	}
}