import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bReader.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int t = 0; t < m; t++) {
			st = new StringTokenizer(bReader.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			while (x < y) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
				x++;
				y--;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
