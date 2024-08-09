class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int [200];
        
        for(int i = 0; i < lines.length; i++){
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for(int j = start; j < end; j++){
                cnt[j]++;
            }
        }
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}