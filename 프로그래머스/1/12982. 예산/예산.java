import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int result = 0;
        
        // budget에서 d[i]를 하나씩 빼면서 확인
        for(int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            }
            answer++;
        }
                
        return answer;
    }
}