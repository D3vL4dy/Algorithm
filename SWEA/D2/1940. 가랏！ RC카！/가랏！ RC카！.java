import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		int n, nowSpeed, distance;
		for (int t = 1; t <= tc; t++) {
			nowSpeed = 0;
			distance = 0;
			n = Integer.parseInt(br.readLine());

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				switch (Integer.parseInt(st.nextToken())) {
				case 1:
					nowSpeed += Integer.parseInt(st.nextToken());
					break;
				case 2:
					nowSpeed -= Integer.parseInt(st.nextToken());
					if (nowSpeed < 0)
						nowSpeed = 0;
					break;
				}
				distance += nowSpeed;
			}

			System.out.println("#" + t + " " + distance);
		}
	}

}