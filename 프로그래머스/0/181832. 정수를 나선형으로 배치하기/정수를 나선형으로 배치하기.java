class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = { 0, 1, 0, -1};
        int[] dy = { 1, 0, -1, 0};
        
        int cnt = 1;
        int dir = 0;
        int x = 0, y = 0;

        while(cnt <= n*n) {
            answer[x][y] = cnt;
            cnt += 1;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < n && answer[nx][ny] == 0) {
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4;
                x += dx[dir];
                y += dy[dir];
            }
        }
        
        return answer;
    }
}