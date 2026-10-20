class Solution {
    public boolean divideArray(int[] nums) {
       /*HashMap <Integer,Integer> map = new HashMap<>();
       for(int i = 0 ;  i < nums.length ; i++){
        if(map.containsKey(nums[i])){
            int freq = map.get(nums[i]);
            map.put(nums[i],freq+1);
        }
        else map.put(nums[i],1);
       }
       int n = nums.length;
       int c = -1;
       for (Integer value : map.values()){
        if(value%2!=0) return false;
       }
       return true;*/
       HashSet <Integer> set = new HashSet <>();
       for(int i = 0 ; i < nums.length ; i++){
        if(set.contains(nums[i])) set.remove(nums[i]);
        else set.add(nums[i]);
       }
       if(set.isEmpty()) return true;
       return false;
    }
}
