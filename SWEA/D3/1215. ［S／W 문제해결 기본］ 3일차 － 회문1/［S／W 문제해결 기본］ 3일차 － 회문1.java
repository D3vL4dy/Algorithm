import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			int find = Integer.parseInt(br.readLine());
			int cnt = 0;
			boolean flag = false; // 회문 여부 판단

			char[][] arr = new char[8][8];
			for (int i = 0; i < arr.length; i++) {
				String str = br.readLine();
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - find + 1; j++) {
					//가로
					flag = true;
					// 가운데 값을 중심으로 대칭인지 확인
					for (int k = 0; k < find / 2; k++) {
						if (arr[i][j + k] != arr[i][j - k + find - 1]) {
							flag = false;
							break;
						}
					}

					if (flag) {
						cnt++;
					}
					
					//세로
					flag = true;
					for (int k = 0; k < find / 2; k++) {
						if (arr[j + k][i] != arr[j - k + find - 1][i]) {
							flag = false;
							break;
						}
					}
					
					if (flag) {
						cnt++;
					}
				}
			}

			System.out.println("#" + t + " " + cnt);
		}

	}

}