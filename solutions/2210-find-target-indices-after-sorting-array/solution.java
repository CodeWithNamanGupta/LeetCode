class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c = 0;
        int lessc = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==target) c++;
            else if(nums[i]<target) lessc++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < c ; i++ ) {
            result.add(lessc);
            lessc++;
        }
        return result;
    }
}
