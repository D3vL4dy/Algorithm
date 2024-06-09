import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bReader.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			arr[i] = i;
		}

		for (int t = 0; t < m; t++) {
			st = new StringTokenizer(bReader.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
		for (int p = 1; p <= n; p++) {
			System.out.print(arr[p] + " ");
		}

	}

}
