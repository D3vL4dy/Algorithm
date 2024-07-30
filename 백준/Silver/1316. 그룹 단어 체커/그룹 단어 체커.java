import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (check()) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}

	public static boolean check() {
		boolean[] chk = new boolean[26];
		char prev = 0;

		String str = scanner.next();

		for (int i = 0; i < str.length(); i++) {
			char now = str.charAt(i);

			if (prev != now) {
				if (chk[now - 'a']) {
					return false;
				}
				chk[now - 'a'] = true;
			}
			prev = now;
		}

		return true;
	}

}