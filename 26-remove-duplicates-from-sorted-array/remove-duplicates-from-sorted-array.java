class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;
        int k = 1;
        while (right<nums.length){
            if ( nums[left-1]!=nums[right] ){
                nums[left]=nums[right];
                left++;
                k++;
            }
            right++;
        }
        return k;
    }
}