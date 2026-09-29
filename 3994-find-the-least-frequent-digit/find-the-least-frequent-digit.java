class Solution {
    public int getLeastFrequentDigit(int n) {
       HashMap <Integer,Integer> map = new HashMap (); 
       int leastfreq = Integer.MAX_VALUE;
       for(int i = n ; i > 0 ; i = i/10){
        int d= i%10;
        if(map.containsKey(d)){
            int freq = map.get(d);
            map.put(d,freq+1);
        }
        else{
            map.put(d,1);
        }
       }
       int k = 0;
       for(int i : map.keySet()){
        int freq = map.get(i);
        if(leastfreq>freq){
            leastfreq = freq;
            k = i;
        }
       }
       return k;
    }
}