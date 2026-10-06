class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        int diff = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(i<k){
                diff+=nums[nums.length-1-i] - nums[i];
            }
            else break;
        }
        return Math.abs(diff);
    }
}