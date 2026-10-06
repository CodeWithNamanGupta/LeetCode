class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int maxinc = 1 ; 
        int maxdec = 1;
        int max = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1]<nums[i]){
            maxinc++; 
            maxdec=1;
            }
            else if(nums[i-1]>nums[i]){
                maxdec++;
                maxinc=1;
            }
            else{
                maxinc = 1;
                maxdec = 1;
            }
            max = Math.max(max,Math.max(maxinc,maxdec));
        }
        return max;
    }
}