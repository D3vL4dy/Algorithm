import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int[] arr = new int[8];
		for (int t = 1; t <= 10; t++) {
			br.readLine();
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 8; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int cnt = 1;
			boolean flag = false;

			while (!flag) {
				for (int i = 0; i < arr.length; i++) {
					arr[0] -= cnt;
					int temp = arr[0];

					for (int j = 0; j < 7; j++) {
						arr[j] = arr[j + 1];
					}

					arr[7] = temp;

					if (arr[7] <= 0) {
						arr[7] = 0;
						flag = true;
						break;
					} else {
						if (cnt == 5) {
							cnt = 1;
						} else {
							cnt++;
						}
					}
				}
			}

			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			System.out.println("#" + t + " " + sb);
			sb.setLength(0); // 출력 후 비워주기
		}
	}
}