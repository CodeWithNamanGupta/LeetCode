class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> map = new HashMap <>();
        for(int i = 0 ; i < s.length() ; i++){
            char n = s.charAt(i);
            if(map.containsKey(n)){
                int freq = map.get(n);
                map.put(n,freq+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(int i = 0 ; i < s.length(); i++){
            char n = s.charAt(i);
            if(map.get(n)==1) return i;
        }
        return -1;
    }
}