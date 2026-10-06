class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
            else map.put(s.charAt(i),1);
        }
        int maxOdd = -1;
        int minEven = Integer.MAX_VALUE;
        for (int f : map.values()) {
            if (f%2!=0) maxOdd = Math.max(maxOdd, f);
            else minEven = Math.min(minEven, f);
        }
        if (maxOdd == -1 || minEven == Integer.MAX_VALUE) return -1;
        return maxOdd - minEven;
    }
}