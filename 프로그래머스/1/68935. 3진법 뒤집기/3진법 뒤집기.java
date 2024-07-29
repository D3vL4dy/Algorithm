class Solution {
    public int solution(int n) {
        // 문자열을 원하는 진법으로 변환
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        String rev = sb.reverse().toString();
        
        // 해당 문자열을 주어진 진법으로 해석하여 10진법 정수로 반환
        return Integer.parseInt(rev, 3);
    }
}