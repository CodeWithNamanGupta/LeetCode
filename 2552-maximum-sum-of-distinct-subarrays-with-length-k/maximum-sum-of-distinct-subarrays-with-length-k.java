class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long maxSum=0;
        long currSum=0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            while(set.contains(nums[right])||set.size()==k){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            currSum+=nums[right];
            set.add(nums[right]);
            if(set.size()==k){
                maxSum=Math.max(maxSum,currSum);
            }
            right++;
        }
        return maxSum;
    }
}