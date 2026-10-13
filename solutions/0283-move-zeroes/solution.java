class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length!=1){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[k];//temp is added for example [1,0] will give error if not used temp to store current value of k index
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }
    }
}
