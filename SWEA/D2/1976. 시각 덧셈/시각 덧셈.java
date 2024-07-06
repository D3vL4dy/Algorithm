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
			int t1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());

			int T = t1 + t2;
			int M = m1 + m2;

			if (M > 59) {
				T += 1;
				M -= 60;
			}

			if (T > 12) {
				T -= 12;
			}

			System.out.println("#" + t + " " + T + " " + M);
		}
	}

}