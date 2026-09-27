class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(nums[i]!=list.get(i)){
                nums[i]=list.get(i);
            }
        }
        return list.size();
    }
}