import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        // count번 반복하며 이용료 누적 금액 구하기
        long need = 0;
        for(int i = 1; i <= count; i++) {
            need += price * i;
        }
        // 내가 가진 money에서 필요한 금액 빼기
        if(money - need >= 0) {
            answer = 0;
        } else {
            answer = Math.abs(money - need);
        }
        
        return answer;
    }
}

