class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap <>();
        int [] arr = {-1,-1};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int j = target - nums[i];
            if(nums[i]!=j&&map.containsKey(j)){
                if(j*nums[i]>max){
                    max = j*nums[i];
                    if(j>nums[i]){
                    arr[0] = map.get(j);
                    arr[1] = i;
                    }
                    else if(j<nums[i]){
                        arr[1] = map.get(j);
                        arr[0] = i;
                    }
                }
            }
             map.putIfAbsent(nums[i],i);
        }
        return arr;
    }
}
