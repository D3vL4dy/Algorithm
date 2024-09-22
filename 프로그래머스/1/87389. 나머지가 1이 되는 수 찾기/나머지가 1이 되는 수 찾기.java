class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i < n; i++) {
            // n % n - 1은 무조건 나머지가 1이므로 for문에서 항상 1이 되는 수를 찾을 수 있다.
            if(n % i == 1) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
}