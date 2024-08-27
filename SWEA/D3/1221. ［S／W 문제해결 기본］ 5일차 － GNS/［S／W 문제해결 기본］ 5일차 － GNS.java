import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception, IOException {
		Scanner sc = new Scanner(System.in);
		String[] num = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			String s = sc.next();
			int n = sc.nextInt();
			int[] arr = new int[10];

			for (int i = 0; i < n; i++) {
				String tmp = sc.next();
				for (int j = 0; j < 10; j++) {
					if (tmp.equals(num[j])) {
						arr[j]++;
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i]; j++) {
					sb.append(num[i] + " ");
				}
			}

			System.out.println("#" + t + " " + sb);
		}

	}

}