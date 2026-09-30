class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size()==set.size();
    }
}
