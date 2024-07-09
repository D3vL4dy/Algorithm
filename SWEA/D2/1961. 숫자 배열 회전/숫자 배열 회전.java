import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int i = 1; i <= tc; i++) {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < n; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}

			int[][] arr_90 = Rotation(arr);
			int[][] arr_180 = Rotation(arr_90);
			int[][] arr_270 = Rotation(arr_180);

			System.out.println("#" + i + " ");

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(arr_90[j][k]);
				}
				System.out.print(" ");

				for (int k = 0; k < n; k++) {
					System.out.print(arr_180[j][k]);
				}
				System.out.print(" ");

				for (int k = 0; k < n; k++) {
					System.out.print(arr_270[j][k]);
				}
				System.out.println();
			}
		}

	}

	private static int[][] Rotation(int[][] arr) {
		int[][] result = new int[arr.length][arr.length];

		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				result[j][k] = arr[arr.length - 1 - k][j];
			}
		}

		return result;
	}

}