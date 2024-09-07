import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int n, k, cnt;
	static int[] arr;

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[n];

			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			cnt = 0;
			powerset(0, 0); // 배열의 첫 인덱스, sum 초기화
			System.out.println("#" + t + " " + cnt);
		}
	}

	private static void powerset(int idx, int sum) {
		// 배열의 모든 원소를 확인했을 때
		if (idx == n) {
			// 부분집합의 합이 k와 같으면
			if (sum == k) {
				cnt++;
				return;
			}
		} else {
			// 현재 원소를 선택하지 않은 경우
			powerset(idx + 1, sum);
			// 현재 원소를 선택하는 경우
			powerset(idx + 1, sum + arr[idx]);
		}
	}
}