class Solution {
    public int appendCharacters(String s, String t) {
        int k = t.length();
        int i = 0 ;
        int tp = 0;
        while (i<s.length()&&tp<t.length()){
            if(s.charAt(i)==t.charAt(tp)){
                tp++;
                k--;
            }
            i++;
        }
        return k;
    }
}