import java.util.*;
class Solution {
    public String solution(String s) {
        
        
        String[] num = s.split(" ");
        Arrays.sort(num);
        String min = num[0];
        String max = num[num.length-1];
        
        String answer = min + " " + max;

        
        return answer;
    }
}