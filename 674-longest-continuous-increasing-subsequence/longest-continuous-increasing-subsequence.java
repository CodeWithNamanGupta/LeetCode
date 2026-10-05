class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) return 1;
        int c = 1;
        int cmax = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]>nums[i-1]){
                c++;
            }
            else c = 1;
            cmax = Math.max(c,cmax);
        }
        return cmax;
    }
}