import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }
        
        int max = nums.length / 2;
        
        return Math.min(hashSet.size(), max);
    }
}