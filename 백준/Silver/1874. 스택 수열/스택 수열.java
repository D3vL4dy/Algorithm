import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sBuilder = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(bReader.readLine());
		int val = 1;

		for (int i = 0; i < n; i++) {
			int target = Integer.parseInt(bReader.readLine());

			while (val <= target) {
				stack.push(val);
				val++;
				sBuilder.append("+\n");
			}

			if (stack.peek() == target) {
				stack.pop();
				sBuilder.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println(sBuilder);
	}
}
