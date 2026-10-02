class Solution {
    public int[] findErrorNums(int[] nums) {
        int nsum = nums.length * (nums.length+1)/2;
        int asum = 0;
        int k = 0;
        HashSet <Integer> set = new HashSet <>();
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                k = nums[i];
                }
            else{
                set.add(nums[i]);
                asum = asum + nums[i];
                }
        }
        int [] arr = new int [2];
        arr[0] = k;
        arr[1] = Math.abs(nsum-asum);
        return arr;
    }
}