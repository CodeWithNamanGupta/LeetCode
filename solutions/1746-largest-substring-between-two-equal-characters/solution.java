class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap <Character , Integer> map = new HashMap<>();
        int maxlen = -1;
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                int indx = map.get(s.charAt(i));
                maxlen=Math.max(i-1-indx,maxlen);
            }
            else map.put(s.charAt(i),i);
        }
        return maxlen;
    }
}
