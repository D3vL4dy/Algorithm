import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sBuilder = new StringBuilder();

		int tc = Integer.parseInt(bReader.readLine());

		for (int t = 1; t <= tc; t++) {
			String str = bReader.readLine();
			String arr[] = str.split(" ");

			for (int i = 0; i < arr.length; i++) {
				StringBuilder wordBuilder = new StringBuilder(arr[i]);
				arr[i] = wordBuilder.reverse().toString();
                sBuilder.append(arr[i]);

                if (i != arr.length - 1) {
                    sBuilder.append(" ");
                }
			}
			sBuilder.append("\n");
		}

		System.out.println(sBuilder);
	}

}