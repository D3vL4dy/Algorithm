class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int len = str.length();
        int[] arr = new int[len];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(len - 1 - i) - '0';
        }
        
        return arr;
    }
}