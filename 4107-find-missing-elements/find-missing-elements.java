class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = 100;
        int max = 1;
        for ( int i = 0 ; i < nums.length ; i++ ){
            set.add(nums[i]);
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        for (int i = min ; i < max ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}