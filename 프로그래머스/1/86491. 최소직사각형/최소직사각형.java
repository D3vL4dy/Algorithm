class Solution {
    public int solution(int[][] sizes) {
        int maxw = 0;
        int maxh = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            maxw = Math.max(maxw, sizes[i][0]);
            maxh = Math.max(maxh, sizes[i][1]);

        }
        
        return maxw * maxh;
    }
}