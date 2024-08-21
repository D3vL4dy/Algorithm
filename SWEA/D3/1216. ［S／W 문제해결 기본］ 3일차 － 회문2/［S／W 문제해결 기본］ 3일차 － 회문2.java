import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			int testCase = Integer.parseInt(br.readLine());

			char[][] row = new char[100][100];
			for (int i = 0; i < 100; i++) {
				String str = br.readLine();
				row[i] = str.toCharArray();
			}

			char[][] col = new char[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					col[i][j] = row[j][i];
				}
			}

			int maxLen = 0;

			// 행 확인
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					for (int len = 1; len <= 100 - j; len++) {
						boolean flag = true;
						for (int k = 0; k < len / 2; k++) {
							if (row[i][j + k] != row[i][j + len - 1 - k]) {
								flag = false;
								break;
							}
						}
						if (flag && len > maxLen) {
							maxLen = len;
						}
					}
				}
			}

			// 열 확인
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					for (int len = 1; len <= 100 - j; len++) {
						boolean flag = true;
						for (int k = 0; k < len / 2; k++) {
							if (col[i][j + k] != col[i][j + len - 1 - k]) {
								flag = false;
								break;
							}
						}
						if (flag && len > maxLen) {
							maxLen = len;
						}
					}
				}
			}

			System.out.println("#" + testCase + " " + maxLen);
		}
	}
}
