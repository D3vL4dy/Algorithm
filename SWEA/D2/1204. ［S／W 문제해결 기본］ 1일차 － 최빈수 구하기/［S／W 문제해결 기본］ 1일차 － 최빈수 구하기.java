import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			br.readLine();
			int[] score = new int[101];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 1000; i++) {
				int n = Integer.parseInt(st.nextToken());
				score[n]++;
			}

			int maxScore = 0;
			int ans = 0;

			for (int i = 0; i < score.length; i++) {
				if (score[i] >= maxScore) {
					maxScore = score[i];
					ans = i;
				}
			}
			System.out.println("#" + t + " " + ans);
		}

	}

}