import java.util.*;

class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int[] numbers = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            numbers[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(numbers);

        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        
        String answer = min + " " + max;
        
        return answer;
    }
}
