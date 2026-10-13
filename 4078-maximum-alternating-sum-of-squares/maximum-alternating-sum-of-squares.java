class Solution {
    public long maxAlternatingSum(int[] nums) {
        long m [] = new long [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            m[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(m);
        long sum = 0;
        for(int i = 0 ; i < nums.length/2 ; i++){
            sum+= (int) (m[nums.length-1-i] - m[i]);
        }
        if(nums.length % 2 != 0){
            sum+=m[nums.length/2];
        }
        return sum;
    }
}