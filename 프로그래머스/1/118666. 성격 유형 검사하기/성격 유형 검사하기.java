import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = { 0, 3, 2, 1, 0, 1, 2, 3 };
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++) {
            // choices가 3보다 작다면 map.put(survey의 앞 문자, score의 인덱스에 해당하는 값)
            if(choices[i] < 4) {
                String s = String.valueOf(survey[i].charAt(0));
                map.put(s, map.getOrDefault(s, 0) + score[choices[i]]);
            } else {
                String s = String.valueOf(survey[i].charAt(1));
                map.put(s, map.getOrDefault(s, 0) + score[choices[i]]);
            }
        }
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        return answer;
    }
}
