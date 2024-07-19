import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sBuilder = new StringBuilder();

		int tc = Integer.parseInt(bReader.readLine());

		for (int t = 1; t <= tc; t++) {
			Stack<Character> stack = new Stack<>();
			String str = bReader.readLine();

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(') {
					stack.push(ch);
				} else if (ch == ')') {
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(ch);
					}
				}
			}

			if (stack.isEmpty()) {
				sBuilder.append("YES");
			} else {
				sBuilder.append("NO");
			}

			sBuilder.append("\n");
		}

		System.out.println(sBuilder);
	}

}
