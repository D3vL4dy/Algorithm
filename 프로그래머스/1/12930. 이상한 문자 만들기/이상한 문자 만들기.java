class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] str = s.toCharArray();
        int idx = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    str[i] = Character.toUpperCase(str[i]);
                } else {
                    str[i] = Character.toLowerCase(str[i]);
                }
                idx++;
            }
            answer.append(str[i]);
        }
        
        return answer.toString();
    }
}
