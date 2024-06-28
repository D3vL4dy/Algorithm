import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 케이크 길이
		int[] arr = new int[L+1]; 
		for (int i = 1; i < arr.length; i++) { // 모든 케이크의 값을 1로 초기화
			arr[i] = 1;
		}
		int N = Integer.parseInt(br.readLine()); // 방청객 수
		int max1 = 0, max1_i = 0; // 가장 많은 케이크를 받을 것으로 예상되는 방청객의 정보
		int max2 = 0, max2_i = 0; // 실제로 가장 많은 케이크를 받은 방청객의 정보

		for (int i = 1; i < N + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cnt = 0; // 각 방청객에 대한 케이크 조각 수를 계산하기 전에 초기화 필요

			if (max1 < (end - start + 1)) { // 원한 갯수가 가장 큰 값이면 갱신
				max1 = end - start + 1;
				max1_i = i;
			}

			for (int j = start; j < end + 1; j++) {
				cnt += arr[j]; // 실제 i번 방청객이 받은 갯수
			}

			if (max2 < cnt) { // 실제로 받은 갯수가 가장 큰 값이면 갱신
				max2 = cnt;
				max2_i = i;
			}
			for (int j = start; j < end + 1; j++) {
				arr[j] = 0; // 이미 받은 조각에 대해 0으로 표시
			}
		}

		System.out.println(max1_i + " \n" + max2_i);

	}
}