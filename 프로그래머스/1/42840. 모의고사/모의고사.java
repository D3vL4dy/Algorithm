import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == arr1[i % 5]){
                cnt[0]++;
            } 
            if(answers[i] == arr2[i % 8]){
                cnt[1]++;
            } 
            if(answers[i] == arr3[i % 10]){
                cnt[2]++;
            }
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            if(max == cnt[i])
                list.add(i+1);
        }
        
        return list;
    }
}