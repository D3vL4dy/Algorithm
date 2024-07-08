import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());

			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			System.out.println("#" + t + " " + sb);
		}

	}

}