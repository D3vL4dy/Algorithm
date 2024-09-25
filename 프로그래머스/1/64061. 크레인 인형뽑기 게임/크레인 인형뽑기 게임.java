import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); // 바구니로 사용할 스택 선언
        int target = 0;
        
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                // moves[i]에 해당하는 값을 board에서 찾는다. 
                target = board[j][moves[i] - 1];
                
                if(target != 0) {
                    // 스택의 최상단 값과 현재 입력된 값이 같으면 스택에서 제거한다. 
                    if(!stack.isEmpty() && stack.peek() == target) {
                        stack.pop();
                        answer += 2;
                    } else {
                        // 스택에 값을 추가한다.
                        stack.push(target);
                    }
                    
                    // 해당 board의 값을 0으로 바꾼다.
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}