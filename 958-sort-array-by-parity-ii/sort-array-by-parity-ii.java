class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0){
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k] = temp;
                k++;
            }
        }
        for(int i = 1 ; i < nums.length/2 ; i=i+2){
            int temp = nums[nums.length-1-i];
            nums[nums.length-1-i]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}