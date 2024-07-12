import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sBuilder = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		int tc = Integer.parseInt(bReader.readLine());

		for (int t = 0; t < tc; t++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());
			String str = stringTokenizer.nextToken();

			if (str.equals("push")) {
				stack.push(Integer.parseInt(stringTokenizer.nextToken()));
			}

			if (str.equals("pop")) {
				if (stack.isEmpty()) {
					sBuilder.append("-1").append("\n");
				} else {
					sBuilder.append(stack.pop()).append("\n");
				}
			}

			if (str.equals("size")) {
				sBuilder.append(stack.size()).append("\n");
			}

			if (str.equals("empty")) {
				sBuilder.append(stack.isEmpty() ? "1" : "0").append("\n");
			}

			if (str.equals("top")) {
				if (stack.isEmpty()) {
					sBuilder.append("-1").append("\n");
				} else {
					sBuilder.append(stack.peek()).append("\n");
				}
			}

		}

		System.out.println(sBuilder);

	}

}