import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sBuilder = new StringBuilder();

		int tc = Integer.parseInt(bReader.readLine());

		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(bReader.readLine());
			int result = (N / 2) * -1;

			if (N % 2 == 1) {
				result += N;
			}

			sBuilder.append("#" + t + " " + result + "\n");
		}

		System.out.println(sBuilder);
	}

}