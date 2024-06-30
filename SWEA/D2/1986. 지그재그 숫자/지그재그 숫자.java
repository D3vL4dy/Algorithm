import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());

		for (int i = 1; i <= tc; i++) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;

			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {

					sum -= j;
				} else {
					sum += j;
				}
			}

			bw.write("#" + i + " " + sum + "\n");

		}

		bw.flush();
		bw.close();
	}

}