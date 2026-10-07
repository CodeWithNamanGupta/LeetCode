class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1);
        }
        int luckyInteger = -1;
        for(int i = 0 ; i < arr.length ; i++) {
            if (map.get(arr[i]) == arr[i]) {
                luckyInteger = Math.max(luckyInteger,arr[i]); 
            }
        }
        return luckyInteger;  
    }
}