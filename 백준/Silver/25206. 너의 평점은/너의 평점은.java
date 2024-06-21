import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double sum = 0.0; // 학점 * 과목평점의 합
		double gradeSum = 0.0; // 학점의 합

		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String object = st.nextToken();
			double num = Double.parseDouble(st.nextToken()); // 학점
			String grade = st.nextToken(); // 등급

			if (!(grade.equals("P"))) {
				switch (grade) {
				case "A+":
					sum += num * 4.5;
					gradeSum += num;
					break;
				case "A0":
					sum += num * 4.0;
					gradeSum += num;
					break;
				case "B+":
					sum += num * 3.5;
					gradeSum += num;
					break;
				case "B0":
					sum += num * 3.0;
					gradeSum += num;
					break;
				case "C+":
					sum += num * 2.5;
					gradeSum += num;
					break;
				case "C0":
					sum += num * 2.0;
					gradeSum += num;
					break;
				case "D+":
					sum += num * 1.5;
					gradeSum += num;
					break;
				case "D0":
					sum += num * 1.0;
					gradeSum += num;
					break;
				case "F":
					gradeSum += num;
					break;
				}
			}
		}
		System.out.printf("%.6f", (sum / gradeSum));
	}
}