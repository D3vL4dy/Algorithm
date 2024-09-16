import java.util.*;
import java.io.*;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meetings[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // 1. 종료시간이 빠른 회의 먼저
        // 2. 종료시간이 같다면 시작시간이 빠른 회의 먼저
        Arrays.sort(meetings, (o1, o2) -> {
            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });

        int cnt = 0; // 선택한 회의의 개수
        int ended = 0; // 이전에 선택한 회의가 끝난 시간
        for (int i = 0; i < N; i++) {
            if (ended <= meetings[i].start) { // 현재 회의의 시작 시간이 이전 회의가 끝난 시간 이후일 경우
                cnt++;
                ended = meetings[i].end; // 현재 회의의 끝나는 시간으로 갱신
            }
        }

        System.out.println(cnt);
    }
}
