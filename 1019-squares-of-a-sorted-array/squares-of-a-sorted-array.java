class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        if(nums[0]>=0){
            while (left<=right){
                nums[left]=nums[left]*nums[left];
                left++;
            }
            return nums;
        }
        for (int i = nums.length-1; i>=0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sq[i] = nums[left]*nums[left];
                left++;
            } else {
                sq[i] = nums[right]*nums[right];
                right--;
            }
        }
        return sq;        
    }
}