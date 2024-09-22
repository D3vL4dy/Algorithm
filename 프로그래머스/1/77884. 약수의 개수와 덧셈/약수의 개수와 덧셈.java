class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left ~ right까지 약수의 개수 구하기 
        for(int i = left; i <= right; i++) {
            int cnt = sol(i);
            
            // 약수의 개수가 짝수면 더하고 홀수면 빼기
            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    
    // 약수의 개수 구하기
    public int sol(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}