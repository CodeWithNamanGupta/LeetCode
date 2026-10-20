class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                ans+=freq;
                map.put(nums[i],freq+1);
            }
            else map.put(nums[i],1);
        }
        return ans;
    }
}
