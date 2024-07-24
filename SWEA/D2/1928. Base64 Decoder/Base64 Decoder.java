import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			String str = br.readLine();
			String result = new String(Base64.getDecoder().decode(str));
			System.out.println("#" + t + " " + result);
		}
	}

}