import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hash = new HashMap<>();
        
        // 1. 의상 종류별로 구분
        for(String[] clothe : clothes){
            String type = clothe[1];
            hash.put(type, hash.getOrDefault(type, 0) + 1);
        }
        
        // 2. 모든 경우의 수 구하기
        int answer = 1;
        for(int val : hash.values()){
            answer *= val + 1;
        }
                
        return answer - 1;
    }
}