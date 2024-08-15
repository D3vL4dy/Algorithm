import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 0; t < tc; t++) {
			// 1. N개의 옷 입력 받기
			int N = Integer.parseInt(br.readLine());
			HashMap<String, Integer> hash = new HashMap<>();

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken(); // 옷의 종류만 필요하기 때문에 호출하여 값을 버려준다.
				String type = st.nextToken();
				hash.put(type, hash.getOrDefault(type, 0) + 1);
			}

			// 2. 전체 경우의 수 계산하여 출력
			int answer = 1;
			for (int val : hash.values()) {
				answer *= val + 1;
			}
			bw.write(String.valueOf(answer - 1));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();

	}

}