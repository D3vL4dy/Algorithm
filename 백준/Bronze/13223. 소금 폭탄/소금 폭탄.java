import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] currentTime = br.readLine().split(":");
        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMinute = Integer.parseInt(currentTime[1]);
        int currentSecond = Integer.parseInt(currentTime[2]);

        String[] dropTime = br.readLine().split(":");
        int dropHour = Integer.parseInt(dropTime[0]);
        int dropMinute = Integer.parseInt(dropTime[1]);
        int dropSecond = Integer.parseInt(dropTime[2]);

        int needHour = dropHour - currentHour;
        int needMinute = dropMinute - currentMinute;
        int needSecond = dropSecond - currentSecond;

        if (needSecond < 0) {
            needSecond += 60;
            needMinute--;
        }

        if (needMinute < 0) {
            needMinute += 60;
            needHour--;
        }

        if (needHour <= 0) {
            needHour += 24;
        }

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}