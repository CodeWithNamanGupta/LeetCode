class Solution {
    public int maxProduct(int[] nums) {
        int low = 0;
        int high = 0;
        for( int i = 0 ; i < nums.length ; i++){
            if(high<=nums[i]){
                low = high;
                high = nums[i];
            }
            else{
                if(low<nums[i]) low = nums[i];
            }
        }
        return (high-1)*(low-1);
    }
}