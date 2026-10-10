class Solution {
    public int captureForts(int[] forts) {
        int left = 0;
        int max = 0;
        for(int i = 0 ; i < forts.length ; i++){
            if(forts[i]!=0){
                if(forts[left]== -forts[i]){
                    max = Math.max(max,i-left-1);
                }
                left = i;
            }
        }
        return max;
    }
}